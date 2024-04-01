package com.pratice.Jpamapping.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.Jpamapping.Entity.Roles;
import com.pratice.Jpamapping.Entity.User;
import com.pratice.Jpamapping.Service.UserRoleService;

@RestController
public class UserRoleController {

	@Autowired
	private UserRoleService service;
	
	@PostMapping("/userinsert")
	public  ResponseEntity<User> userRole(@RequestBody User user)
	{
		User u= service.insert(user);
		return ResponseEntity.ok(u);
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<User>> userRole()
	{
		List<User> list=service.get();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping("/getroles")
	public ResponseEntity<List<Roles>> roleUsers()
	{
		List<Roles> list=service.getRole();
		return ResponseEntity.ok(list);
		
	}
	

	@GetMapping("/check")
	public ResponseEntity<String> checking() throws IOException {
	    throw new IOException("An IO exception occurred.");
	}

}

