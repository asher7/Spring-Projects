package com.employee.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.microservice.Service.EmployeeService;
import com.employee.microservice.dto.EmployeeResponse;

@RestController
public class EmployeeController {
	
	@Autowired(required = true)
	private  EmployeeService employeeService;
	
	@GetMapping("/employees/{id}")
	ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable int id)
	{
		EmployeeResponse employeeResponse= employeeService.getEmployeeId(id);
		return ResponseEntity.ok(employeeResponse);
	}

}
