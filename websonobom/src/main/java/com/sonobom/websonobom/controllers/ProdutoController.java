package com.sonobom.websonobom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonobom.websonobom.entities.Colchao;
import com.sonobom.websonobom.entities.Produto;
import com.sonobom.websonobom.repositories.ColchaoRepository;
import com.sonobom.websonobom.repositories.ProdutoRepository;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;

	@GetMapping
	public List<Produto> findAll(){
		List<Produto> result =  repository.findAll();
		return result;
	}
}
