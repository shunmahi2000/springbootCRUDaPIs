package com.sarhari.blogapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarhari.blogapp.entities.Comment;

public interface CommentRepo extends JpaRepository<Comment,Integer> {

}
