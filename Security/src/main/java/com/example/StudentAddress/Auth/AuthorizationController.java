package com.example.StudentAddress.Auth;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentAddress.entity.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth/rj")
@RequiredArgsConstructor
public class AuthorizationController {
	@Autowired
	UserRepository  repository;
	@Autowired
	private  AuthenticationService authenticationService;
	
	@PostMapping("/register")
	public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request)
	{
		
		return ResponseEntity.ok(authenticationService.register(request));
	}
	@PostMapping("/login")
	public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request)
	{ 
		System.err.println("hello");
		return ResponseEntity.ok(authenticationService.authenticate(request));
		
	}
	@GetMapping("/find")
	public  String get(@RequestParam String email)
	{
		
		 
		return email;
	}
	@PostMapping("/refresh-token")
	  public void refreshToken(
	      HttpServletRequest request,
	      HttpServletResponse response)
	  {}
	  
}
