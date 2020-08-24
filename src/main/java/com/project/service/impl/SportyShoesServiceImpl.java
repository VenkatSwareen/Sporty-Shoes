package com.project.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.SportyShoesRepository;
import com.project.model.Shoes;
import com.project.service.SportyShoesService;

@Service
public class SportyShoesServiceImpl implements SportyShoesService {

	@Autowired
	private SportyShoesRepository dao;
	
	@Override
	public Shoes addShoes(Shoes shoes) {
		return dao.save(shoes);
	}

	@Override
	public Shoes updateShoes(Shoes shoes) {
		return dao.save(shoes);
	}

	@Override
	public void deleteShoesById(int id)  {
		dao.deleteById(id);
	}

	@Override
	public List<Shoes> getAllShoes() {
		return dao.findAll();
	}

	@Override
	public List<Shoes> getAllShoesByCategory(String category) {
		
		return dao.findByCategory(category);
	}

}
