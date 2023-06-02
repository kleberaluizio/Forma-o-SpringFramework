package com.kleberaluizio.screenmatch.controller;

import com.kleberaluizio.screenmatch.domain.filme.DadosCadastroFilme;
import com.kleberaluizio.screenmatch.domain.filme.Filme;
import com.kleberaluizio.screenmatch.domain.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository repository;
    @GetMapping("/formulario")
    public String carregaPaginaFormulario(){
        return "filmes/formulario";
    }

    @GetMapping
    public String carregaPaginaListagem(Model model){
        model.addAttribute("lista", repository.findAll()); //atributos que serao enviado para o html
        return "filmes/listagem";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dados){
        var filme = new Filme(dados);

        repository.save(filme);

        return "redirect:/filmes"; // redireciona para um requisicao para a URL /filmes
    }

}
