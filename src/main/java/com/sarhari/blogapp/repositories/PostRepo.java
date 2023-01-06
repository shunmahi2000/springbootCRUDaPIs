package com.sarhari.blogapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sarhari.blogapp.entities.Category;
import com.sarhari.blogapp.entities.Post;
import com.sarhari.blogapp.entities.User;

public interface PostRepo extends JpaRepository<Post,Integer> {
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	//Inbuilt
	//List<Post> findByTitleContaining(String title);
	//Custom
	@Query("select p from Post p where p.title like :key")
	List<Post> searchByTitle(@Param("key") String title);
}
