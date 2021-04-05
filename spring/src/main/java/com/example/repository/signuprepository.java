package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.UserModel;
import org.springframework.data.jpa.repository.Query;

public interface signuprepository extends JpaRepository<UserModel, String>{
    @Query("FROM UserModel where email=?1")
	UserModel findBysignup(String email);
}
