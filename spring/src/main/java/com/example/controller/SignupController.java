package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserModel;
import com.example.repository.signuprepository;

@RestController
@RequestMapping
public class SignupController {
	@Autowired
	signuprepository repo;
	
	  @PostMapping(value="/load")
	    public List<UserModel> saveUser(@RequestBody final UserModel user) {
	      this.repo.save(user);
	      return repo.findAll();
	    }
}
