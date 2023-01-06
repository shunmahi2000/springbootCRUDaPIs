package com.sarhari.blogapp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarhari.blogapp.entities.User;
//JpaRepository<Entity_name,Entity_ID_dataType>
//provides functionality on user
public interface UserRepo extends JpaRepository<User,Integer> {
	
	Optional<User> findByEmail(String email);
}
