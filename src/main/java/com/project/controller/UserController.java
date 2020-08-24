package com.project.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Shoes;
import com.project.model.Users;
import com.project.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;
	@PostMapping("/user")
	public Users addUsers(@RequestBody Users users) {

		return service.addUsers(users);
	}
	@GetMapping("/users")
	public List<Users> getAllUsers()	{
		return service.getAllUsers();
	}
	@GetMapping("/users/{name}")
	public List<Users> getUsersByname(String name){
		return service.getUserByName(name);
	}
	
}
