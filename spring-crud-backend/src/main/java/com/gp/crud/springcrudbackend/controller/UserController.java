package com.gp.crud.springcrudbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gp.crud.springcrudbackend.model.User;
import com.gp.crud.springcrudbackend.repo.UserRepo;

@RestController
public class UserController {

	@Autowired
	private UserRepo userRepo;
	
	@PostMapping("/user")
	User newUser(@RequestBody User newUser) {
		return userRepo.save(newUser);
	}
	
}
