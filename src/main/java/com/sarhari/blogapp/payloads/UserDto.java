package com.sarhari.blogapp.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter 
public class UserDto {
	
	private int id;
	@NotEmpty
	@Size(min=4,message="Username must be of min 4 characters !!")
	private String name;
	
	@Email(message="Email Address is not valid")
	private String email;
	
	
	@NotEmpty
	@Size(min=3,max=10,message="Password must be of min 3 chars and max of 10 chars !!")
//	@Pattern(regexp=) for password only in number and chars
	private String password;
	
	@NotEmpty
	private String about;
}
