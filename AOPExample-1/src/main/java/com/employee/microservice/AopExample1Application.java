package com.employee.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopExample1Application {

	public static void main(String[] args) {
		SpringApplication.run(AopExample1Application.class, args);
	}

}
