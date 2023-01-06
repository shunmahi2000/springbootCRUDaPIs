package com.sarhari.blogapp.payloads;

import com.sarhari.blogapp.entities.Post;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {
	
	private int id;
	private String content;
}
