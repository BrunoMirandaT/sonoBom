package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProdutoController {
	
	@Autowired
	private repositories.ProdutoRepository repository;

	@GetMapping
	public List<entities.Produto> findAll(){
		List<entities.Produto> result =  repository.findAll();
		return result;
	}
}
