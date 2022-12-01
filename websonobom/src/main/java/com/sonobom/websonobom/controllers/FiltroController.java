package com.sonobom.websonobom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonobom.websonobom.entities.Box;
import com.sonobom.websonobom.entities.Colchao;
import com.sonobom.websonobom.entities.Filtro;
import com.sonobom.websonobom.repositories.BoxRepository;
import com.sonobom.websonobom.repositories.ColchaoRepository;
import com.sonobom.websonobom.repositories.FiltroRepository;

@RestController
@RequestMapping(value = "/filtro")
public class FiltroController {
	
	@Autowired
	private FiltroRepository repository;

	@GetMapping
	public List<Filtro> findAll(){
		List<Filtro> result =  repository.findAll();
		return result;
	}
}
