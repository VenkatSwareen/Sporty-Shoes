package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	public List<Users> findByName(String name);
}
