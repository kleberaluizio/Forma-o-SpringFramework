package com.kleberaluizio.screenmatch.controller;

import com.kleberaluizio.screenmatch.domain.filme.DadosAlteracaoFilme;
import com.kleberaluizio.screenmatch.domain.filme.DadosCadastroFilme;
import com.kleberaluizio.screenmatch.domain.filme.Filme;
import com.kleberaluizio.screenmatch.domain.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository repository;
    @GetMapping("/formulario")
    public String carregaPaginaFormulario(Long id, Model model){

        if(id != null){
            var filme = repository.getReferenceById(id);
            model.addAttribute("filme",filme);
        }
        return "filmes/formulario";
    }

    @GetMapping
    public String carregaPaginaListagem(Model model){
        model.addAttribute("lista", repository.findAll()); //atributos que serao enviado para o html
        return "filmes/listagem";
    }

    @PostMapping
    @Transactional
    public String cadastraFilme(DadosCadastroFilme dados){
        var filme = new Filme(dados);

        repository.save(filme);

        return "redirect:/filmes"; // redireciona para um requisicao para a URL /filmes
    }

    @PutMapping
    @Transactional
    public String AlteraFilme(DadosAlteracaoFilme dados){


        var filme = repository.getReferenceById(dados.id());

        filme.atualizaDados(dados);

        return "redirect:/filmes"; // redireciona para um requisicao para a URL /filmes
    }
    @DeleteMapping
    @Transactional

    public String RemoveFilme(Long id){

        repository.deleteById(id);
        return "redirect:/filmes"; // redireciona para um requisicao para a URL /filmes
    }

}
