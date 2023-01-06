//package com.sarhari.blogapp.security;
//
//import java.io.IOException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.MalformedJwtException;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//
//@Component
//public class JWTAUthenticationFilter extends OncePerRequestFilter{
//
//	@Autowired
//	private UserDetailsService userDetailService;
//	
//	@Autowired
//	private JWTTokenHelper jwtTokenHelper;
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
//			throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		//1.get Token
//		String requestToken=request.getHeader("Authorization");
//		
//		//Authorization token  format - Bearer 9874231yn814
//		System.out.println(requestToken);
//		
//		String username=null;
//		String token=null;
//		if(request!=null && requestToken.startsWith("Bearer")) {
//			token=requestToken.substring(7);
//			try {
//			username=this.jwtTokenHelper.getUsernameFromToken(token);
//			}
//			catch(IllegalArgumentException e) {
//				System.out.println("Unable to get JWT token");
//			}catch(ExpiredJwtException e){
//				System.out.println("JWT token has expired");
//			}catch(MalformedJwtException e) {
//				System.out.println("Invalid JWT token");
//			}
//			
//		}else {
//			System.out.println("JWT token does not begin with Bearer");
//		}
//		
//		//once we get the token lets validate
//		
//		if(username!=null && SecurityContextHolder.getContext().getAuthentication()==null) {
//			UserDetails userDetails=this.userDetailService.loadUserByUsername(username); 
//			if(this.jwtTokenHelper.validateToken(token,userDetails)) {
//				UsernamePasswordAuthenticationToken u = new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
//				
//				u.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//				
//				SecurityContextHolder.getContext().setAuthentication(u);			
//				}else {
//				System.out.println("Invalid JWT token");
//			}
//		}else {
//			System.out.println("username is null or context is not null");
//		}
//		
//		
//		filterChain.doFilter(request, response);
//	}
//
//}
