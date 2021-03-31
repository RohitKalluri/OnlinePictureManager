package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserModel;
import com.example.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/admin")
public class UserController {

	@Autowired
	UserRepository repo;
	
	@GetMapping("/")
	 public List<UserModel> getUser()
	{
		return repo.findAll();
	}
	
	@GetMapping("/getOnlineUser")
	public List<UserModel> getOnlineUser()
	{
		return repo.findByUseractive(1);
	}
	@GetMapping("/findUser/{id}")
	 public UserModel userEditData(@PathVariable(value="id") String id)
	 {
		//UserModel m=repo.findByUseremail(id);
		return this.repo.findById(id)
				.orElseThrow();
	 }
	@PutMapping("/userEdit/{id}")
	public boolean userEditSave(@RequestBody UserModel data)
	{
		UserModel a=repo.findByUsername(data.getEmail(),data.getPassword());
		a.setUsername(data.getUsername());
		a.setMobileNumber(data.getMobileNumber());
		repo.save(a);
		return true;
	}
	
	 @PostMapping(value="/addUser")
	    public List<UserModel> saveUser(@RequestBody final UserModel user) {
	      this.repo.save(user);
	      return repo.findAll();
	    }
	
	@GetMapping("/delete/{id}")
	public boolean userDelete(@PathVariable(value="id")  String id)
	{
       UserModel a=repo.findById(id).orElseThrow();
       repo.delete(a);
       return true;
	}
	
}
