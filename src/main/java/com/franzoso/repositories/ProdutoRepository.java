package com.franzoso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.franzoso.domain.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
