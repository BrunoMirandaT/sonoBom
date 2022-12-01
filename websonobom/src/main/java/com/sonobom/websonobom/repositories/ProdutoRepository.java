package com.sonobom.websonobom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonobom.websonobom.entities.Box;
import com.sonobom.websonobom.entities.Filtro;
import com.sonobom.websonobom.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto , Long> {

}
