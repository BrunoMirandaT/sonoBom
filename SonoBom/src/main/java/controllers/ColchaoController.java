package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ColchaoController {
	
	@Autowired
	private repositories.ColchaoRepository repository;

	@GetMapping
	public List<entities.Colchao> findAll(){
		List<entities.Colchao> result =  repository.findAll();
		return result;
	}
}
