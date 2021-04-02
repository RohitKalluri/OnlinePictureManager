package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.ImageModel;


public interface ImageRepository extends JpaRepository<ImageModel, Long> {
	//java.util.Optional<ImageModel> findByName(String name);
}
