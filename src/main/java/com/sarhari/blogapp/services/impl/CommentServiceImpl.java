package com.sarhari.blogapp.services.impl;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarhari.blogapp.entities.Comment;
import com.sarhari.blogapp.entities.Post;
import com.sarhari.blogapp.exceptions.ResourceNotFoundException;
import com.sarhari.blogapp.payloads.CommentDto;
import com.sarhari.blogapp.repositories.CommentRepo;
import com.sarhari.blogapp.repositories.PostRepo;
import com.sarhari.blogapp.services.CommentService;
@Service
public class CommentServiceImpl  implements CommentService{
	
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private CommentRepo commentRepo;
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		// TODO Auto-generated method stub
		Post post =this.postRepo.findById(postId).orElseThrow(()->new ResourceNotFoundException("Post"," Id ", postId));
		Comment comment=this.modelMapper.map(commentDto,Comment.class);
		comment.setPost(post);
		Comment savedComment=this.commentRepo.save(comment);
		return this.modelMapper.map(savedComment,CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		// TODO Auto-generated method stub
		Comment comment=this.commentRepo.findById(commentId).orElseThrow(()->new ResourceNotFoundException("Comment"," Id ", commentId));
		this.commentRepo.delete(comment);
		return;
	}

}
