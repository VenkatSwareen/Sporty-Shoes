package com.project.service;

import java.util.List;

import javax.transaction.Transactional;

import com.project.model.Users;

public interface UserService {

	@Transactional
	public Users addUsers(Users users);
	public List<Users> getUserByName(String name);
	public List<Users> getAllUsers();
	
}
