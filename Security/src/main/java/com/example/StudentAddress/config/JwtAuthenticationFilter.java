package com.example.StudentAddress.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j; 

@Configuration
@Component
@RequiredArgsConstructor
@Slf4j
public class JwtAuthenticationFilter extends OncePerRequestFilter {
	@Autowired
	private JwtService service;
	private final UserDetailsService userDetailsService = null;
  // CORS configuration
  @Bean
  WebMvcConfigurer mvcConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedHeaders("*").allowedMethods("*").allowedOrigins("*");
      }
    };
  }

  // implementation of OncePerRequestFilter
  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {
      
    // retrieve the Authorization header
    String authHeader = request.getHeader("Authorization");
    
    // extract JWT token from Authorization header
    final String jwtToken;
    final String userName;
    
    if (authHeader == null || !authHeader.startsWith("Bearer ")) {
      // if the Authorization header is missing or doesn't start with "Bearer ", continue with filter chain
      filterChain.doFilter(request, response);
      return;
    }
    jwtToken = authHeader.substring(7); // extract the JWT token from the Authorization header (after "Bearer ")
    
    // perform authentication and authorization logic with the JWT token
    // ...
    
    // continue with filter chain
//  filterChain.doFilter(request, response);
    userName=service.extractUsername(jwtToken);
    if(userName != null && SecurityContextHolder.getContext().getAuthentication() == null)
    {
    	UserDetails userDetails=this.userDetailsService.loadUserByUsername(userName);
    	
    	if(service.isTokenValid(jwtToken, userDetails))
    	{
    		UsernamePasswordAuthenticationToken authToken= new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities() );
    		authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
    		SecurityContextHolder.getContext().setAuthentication(authToken);
    	}
    }
    
    filterChain.doFilter(request, response); 
  }
}
