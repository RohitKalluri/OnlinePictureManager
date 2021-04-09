package com.example.controller;

import java.util.Collections;
import java.util.Optional;
import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CommentModel;
import com.example.model.ImageModel;
import com.example.model.TemporaryModel;
import com.example.repository.CommentRepository;
@RestController
@RequestMapping("/comment")
@CrossOrigin(origins = "https://localhost:4200")
public class CommentController {

	
	@Autowired
	CommentRepository repo;
	
	@GetMapping("/")
	
	public java.util.List<CommentModel> allComments(){
		java.util.List<CommentModel> myList=repo.findAll();
		Collections.reverse(myList);
		return myList;
	}
	
	
	
	@PostMapping("/image/{id}")
	public boolean addComment(@PathVariable (value="id") String id,@RequestBody TemporaryModel temp)
	{
		CommentModel model=new CommentModel(Long.parseLong(temp.getId()),temp.getName(),id);
		repo.save(model);
		return true;
		
	}
	
	@GetMapping("/image/delete/{id}")
	public boolean deleteComment(@PathVariable(value="id")  String id) {
		CommentModel model=repo.findByUserId(Long.parseLong(id));
		repo.delete(model);
		return true;
	}

	@DeleteMapping("/delete/{id}")
	public boolean deleteComment1(@PathVariable(value="id")  String id) {
		CommentModel model=repo.findByUserId(Long.parseLong(id));
		repo.delete(model);
		return true;
	}
}
