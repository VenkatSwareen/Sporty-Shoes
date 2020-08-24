package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Shoes;
import com.project.service.SportyShoesService;

@RestController
public class SportyShoesController {

	@Autowired
	private SportyShoesService service;

	
	//private MultiValueMap<String, String> map;
	

	@PostMapping("/shoe")
	public Shoes addShoes(@RequestBody Shoes shoes) {

		return service.addShoes(shoes);
	}

	@PutMapping("/shoe")
	public Shoes updateShoes(@RequestBody Shoes shoes) {

		return service.updateShoes(shoes);
	}


	@DeleteMapping("/shoe/{id}")
	public void deleteShoesById(@PathVariable int id) {

		
			service.deleteShoesById(id);
		
	}

	@GetMapping("/shoes")
	public List<Shoes> getAllShoes() {

		return service.getAllShoes();
	}

	
	@GetMapping("/shoes/{category}")
	public List<Shoes> getAllShoesByCategory(String category){
		return service.getAllShoesByCategory(category);
	}

}
