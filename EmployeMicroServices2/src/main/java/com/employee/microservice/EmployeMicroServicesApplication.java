package com.employee.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmployeMicroServicesApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(EmployeMicroServicesApplication.class, args);
	}

	

}
