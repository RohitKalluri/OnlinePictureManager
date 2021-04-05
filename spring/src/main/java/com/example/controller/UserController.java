package com.example.controller;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CommentModel;
import com.example.model.ImageModel;
import com.example.model.LoginModel;
import com.example.model.UserModel;
import com.example.repository.CommentRepository;
import com.example.repository.ImageRepository;
import com.example.repository.UserRepository;@RestController
@CrossOrigin(origins = "https://8081-fcffcdaacacafeccbeefdaacddcadfaffe.examlyiopb.examly.io")
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
	
	@PostMapping("/getUserName")
	public UserModel getUser(@RequestBody LoginModel data) {
		return repo.findByUsername(data.getEmail(), data.getPassword());
	}

	@Autowired
	ImageRepository imageRepository;
	
	public static byte[] decompressBytes(byte[] data) {
		Inflater inflater = new Inflater();
		inflater.setInput(data);
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
		byte[] buffer = new byte[1024];
		try {
			while (!inflater.finished()) {
				int count = inflater.inflate(buffer);
				outputStream.write(buffer, 0, count);
			}
			outputStream.close();
		} catch (IOException ioe) {
		} catch (DataFormatException e) {
		}
		return outputStream.toByteArray();
	}
	
	@GetMapping("/image")
	public java.util.List<ImageModel> allImages(){
		java.util.List<ImageModel> myList=imageRepository.findAll();
		for(ImageModel image:myList) {
			image.setImage(decompressBytes(image.getImage()));
		}
		Collections.reverse(myList);
		return myList;
	}
	
	@DeleteMapping("/image/{id}")
	public boolean deleteImage(@PathVariable(value="id") String id) {
		imageRepository.deleteById(Long.parseLong(id));
		return true;
	}
	
	@PutMapping("imageEdit/{id}")
	public ImageModel imageEdit(@PathVariable(value="id") String id,@RequestBody ImageModel image) {
		ImageModel model=imageRepository.findById(Long.parseLong(id)).orElseThrow();
		model.setImage(image.getImage());
		model.setImageName(image.getImageName());
		model.setImageTag(image.getImageTag());
		return model;
	}
	
	@Autowired
	CommentRepository commentRepo;
	
	@GetMapping("/comment")
	public java.util.List<CommentModel> getAllComments(){
		return commentRepo.findAll();
	}
	
}
