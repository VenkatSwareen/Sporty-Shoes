package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Shoes;


@Repository
public interface SportyShoesRepository extends JpaRepository<Shoes, Integer>{
	
	public List<Shoes> findByCategory(String category);
}
