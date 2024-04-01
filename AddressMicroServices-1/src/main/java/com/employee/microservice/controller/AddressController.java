package com.employee.microservice.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.employee.microservice.Service.AddressService;
import com.employee.microservice.dto.Address;

@RestController
public class AddressController {
	@Autowired
	private  AddressService addressService;
	
	@GetMapping("/location/{id}")
	ResponseEntity<Address> getAddressByEmployee(@PathVariable int id)
	{
		System.err.println("1");
		Address employee= addressService.getAddressEmployeeId(id);
		System.err.println("end");
		return ResponseEntity.ok(employee);
	}

}
