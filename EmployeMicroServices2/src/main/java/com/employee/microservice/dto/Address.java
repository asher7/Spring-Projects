package com.employee.microservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {


	private int addressId;
	
	
	private String street;


	private String village;
	
	
	private String state;
}
