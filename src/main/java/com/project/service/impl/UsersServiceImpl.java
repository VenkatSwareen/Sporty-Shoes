package com.project.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UsersRepository;
import com.project.model.Users;
import com.project.service.UserService;

@Service
public class UsersServiceImpl implements UserService {

	@Autowired
	private UsersRepository dao;
	
	@Override
	public List<Users> getUserByName(String name) {
		return dao.findByName(name);
	}

	@Override
	public List<Users> getAllUsers() {
		return dao.findAll();
	}

	@Override
	public Users addUsers(Users users) {
		return dao.save(users);
	}

}
