package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.UserModel;

public interface LoginRepository extends JpaRepository<UserModel, String>{

	@Query("FROM UserModel where email=?1 and password=?2")
	UserModel findByUsername(String email,String password);
	@Query(" UPDATE UserModel  SET active =?1 where email=?2 and password=?3")
	UserModel UpdateActivity(int active,String email,String password);

}
