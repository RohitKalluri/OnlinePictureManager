package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, String> {

	@Query("FROM UserModel where active=?1")
	List<UserModel> findByUseractive(int active);

}
