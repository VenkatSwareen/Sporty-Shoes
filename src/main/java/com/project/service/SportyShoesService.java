package com.project.service;

import java.util.List;

import com.project.model.Shoes;

public interface SportyShoesService {
	
	public Shoes addShoes(Shoes shoes);
	public Shoes updateShoes(Shoes shoes);
	public void deleteShoesById(int id) ;
	public List<Shoes> getAllShoes();
	public List<Shoes> getAllShoesByCategory(String category);
}
