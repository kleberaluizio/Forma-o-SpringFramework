package com.kleberaluizio.screenmatch.domain.filme;

import jakarta.persistence.*;

@Entity  // Anotacao que indica para o banco de dados que essa classe e uma tabela
@Table(name = "filmes") //Indica a tabela do banco de dados
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //define como o ID sera gerado
    private Long id;
    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoLancamento;
    private String genero;

    public Filme(){}
    public Filme(DadosCadastroFilme dados) { // Recebe o record vindo do POSTMAPPING
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoLancamento=" + anoLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }
}
