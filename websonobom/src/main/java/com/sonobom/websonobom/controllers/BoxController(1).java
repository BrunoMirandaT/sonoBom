package com.sonobom.websonobom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonobom.websonobom.entities.Box;
import com.sonobom.websonobom.entities.Colchao;
import com.sonobom.websonobom.repositories.BoxRepository;
import com.sonobom.websonobom.repositories.ColchaoRepository;

@RestController
@RequestMapping(value = "/box")
public class BoxController {
	
	@Autowired
	private BoxRepository repository;

	@GetMapping
	public List<Box> findAll(){
		List<Box> result =  repository.findAll();
		return result;
	}
}
