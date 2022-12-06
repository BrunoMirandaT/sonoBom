package controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoxController {
	
	@Autowired
	private repositories.BoxRepository repository;

	@GetMapping
	public List<entities.Box> findAll(){
		List<entities.Box> result =  repository.findAll();
		return result;
	}
}
