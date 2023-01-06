package com.sarhari.blogapp.services;

import java.util.List;

import com.sarhari.blogapp.payloads.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto userDto);
	UserDto updateUser(UserDto userDto,Integer userId);
	UserDto getUserByid(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
}
