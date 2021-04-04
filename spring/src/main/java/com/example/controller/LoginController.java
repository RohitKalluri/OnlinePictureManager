package com.example.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.LoginModel;
import com.example.model.UserModel;
import com.example.repository.LoginRepository;

@RestController
@CrossOrigin(origins = "https://8081-fcffcdaacacafeccbeefdaacddcadfaffe.examlyiopb.examly.io")
@RequestMapping
public class LoginController {
	 @Autowired
	 LoginRepository repo;
	 
	 @PostMapping("/login")
	 public boolean checkUser(@RequestBody final LoginModel data)
	 {
		UserModel a=repo.findByUsername(data.getEmail(),data.getPassword());
		if(a!=null)
		{	
			a.setActive(0);
			repo.save(a);
			return true;		
		
		}
		else
			return false;
		 
	 }

}
