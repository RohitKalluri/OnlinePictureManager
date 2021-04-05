package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserModel;
import com.example.repository.signuprepository;

@RestController
@CrossOrigin(origins = "https://8081-fcffcdaacacafeccbeefdaacddcadfaffe.examlyiopb.examly.io")
@RequestMapping
public class SignupController {
	@Autowired
	signuprepository repo;
	
	 @PostMapping(value="/signup")
	    public boolean saveUser(@RequestBody final UserModel user) {
		  //new
		  UserModel a=repo.findBysignup(user.getEmail());
		  System.out.println(user.getEmail());
         if(a.getEmail().equals(user.getEmail()))
        	 return false;
         else {
		      repo.save(user);
		      return true;
		  }
	  }
}
