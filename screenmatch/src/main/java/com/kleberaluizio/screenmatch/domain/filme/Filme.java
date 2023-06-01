package com.kleberaluizio.screenmatch.domain.filme;

public class Filme {
    private String nome;
    private Integer duracao;
    private Integer ano;
    private String genero;

    public Filme(DadosCadastroFilme dados) { // Recebe o record vindo do POSTMAPPING
        this.nome = dados.nome();
        this.duracao = dados.duracao();
        this.ano = dados.ano();
        this.genero = dados.genero();
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public Integer getAno() {
        return ano;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracao +
                ", anoLancamento=" + ano +
                ", genero='" + genero + '\'' +
                '}';
    }
}
