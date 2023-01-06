//package com.sarhari.blogapp.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import com.sarhari.blogapp.entities.User;
//import com.sarhari.blogapp.exceptions.ResourceNotFoundException;
//import com.sarhari.blogapp.repositories.UserRepo;
//
//public class CustomerUserDetailService implements UserDetailsService{
//
//	@Autowired
//	private UserRepo userRepo;
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		
//		//loading user from database as username
//		User user=this.userRepo.findByEmail(username).orElseThrow(()-> new ResourceNotFoundException("User","email"+username,0));
//		return user;
//	}
//	
//}
