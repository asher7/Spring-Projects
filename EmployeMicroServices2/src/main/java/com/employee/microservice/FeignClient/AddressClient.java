package com.employee.microservice.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.employee.microservice.dto.Address;

@FeignClient(name = "address-service",url="http://localhost:8082")
public interface AddressClient {
	
	@GetMapping("/location/{id}")
	public ResponseEntity< Address> getAddressByEmployeeId(@PathVariable int id);
	
}
