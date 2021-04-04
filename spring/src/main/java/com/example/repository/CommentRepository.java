package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.CommentModel;
import com.example.model.ImageModel;
import com.example.model.UserModel;

public interface CommentRepository extends JpaRepository<CommentModel, String>{
	@Query("FROM CommentModel where id=?1")
	CommentModel findByUserId(Long id);
}
