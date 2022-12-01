package com.sonobom.websonobom.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonobom.websonobom.entities.Lojas;
import com.sonobom.websonobom.repositories.LojasRepository;

@RestController
@RequestMapping(value = "/lojas")
public class LojasController {
	
	@Autowired
	private LojasRepository repository;

	@GetMapping
	public List<Lojas> findAll(){
		List<Lojas> result =  repository.findAll();
		return result;
	}
}
