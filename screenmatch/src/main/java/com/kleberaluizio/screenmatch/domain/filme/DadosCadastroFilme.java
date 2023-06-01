package com.kleberaluizio.screenmatch.domain.filme;

// Os atributos precisam ter o mesmo nome que esta nos inputs, atributo name dos formularios
public record DadosCadastroFilme(
        String nome,
        Integer duracao,
        Integer ano,
        String genero
) {

}
