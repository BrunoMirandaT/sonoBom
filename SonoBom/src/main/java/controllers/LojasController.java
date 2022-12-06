package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LojasController {
	
	@Autowired
	private repositories.LojasRepository repository;

	@GetMapping
	public List<entities.Lojas> findAll(){
		List<entities.Lojas> result =  repository.findAll();
		return result;
	}
}
