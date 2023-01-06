package com.sarhari.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarhari.blogapp.entities.Category;

public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
