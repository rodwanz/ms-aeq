package com.wanzeler.crudarq.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanzeler.crudarq.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
