package com.kleberaluizio.screenmatch.domain.filme;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}

//Permite abstrair algumas coisas da JPA, basta eu criar essa INTERFACE
// JpaRepository tem os metodos para buscar, salvar, deletar, ou seja, interagir com o banco de dados CRUD!
