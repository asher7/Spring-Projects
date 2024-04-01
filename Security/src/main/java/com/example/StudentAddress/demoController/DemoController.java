package com.example.StudentAddress.demoController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/demo")
public class DemoController {

	@GetMapping("/msg")
	public ResponseEntity<String> message()
	{
		return ResponseEntity.ok("Hello");
		
	}
}
