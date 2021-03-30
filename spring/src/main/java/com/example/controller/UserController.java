package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserModel;
import com.example.repository.UserRepository;

@RestController
@RequestMapping
public class UserController {

	@Autowired
	UserRepository repo;
	
	@PostMapping("/getUser")
	 public List<UserModel> getUser()
	{
		return repo.findAll();
	}
	
	@PostMapping("/getOnlineUser")
	public List<UserModel> getOnlineUser()
	{
		return repo.findByUseractive(1);
	}
	
	
}
