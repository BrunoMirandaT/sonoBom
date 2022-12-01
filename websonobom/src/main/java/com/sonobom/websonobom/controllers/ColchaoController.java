package com.sonobom.websonobom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonobom.websonobom.entities.Colchao;
import com.sonobom.websonobom.repositories.ColchaoRepository;

@RestController
@RequestMapping(value = "/colchao")
public class ColchaoController {
	
	@Autowired
	private ColchaoRepository repository;

	@GetMapping
	public List<Colchao> findAll(){
		List<Colchao> result =  repository.findAll();
		return result;
	}
}
