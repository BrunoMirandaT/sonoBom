package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FiltroController {
	
	@Autowired
	private repositories.FiltroRepository repository;

	@GetMapping
	public List<entities.Filtro> findAll(){
		List<entities.Filtro> result =  repository.findAll();
		return result;
	}
}
