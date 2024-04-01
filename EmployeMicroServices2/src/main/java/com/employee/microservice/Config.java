package com.employee.microservice;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class Config {
	
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
	@Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
	
	
	@Value("${employeeUrl}")
	private String url;
	
	@Bean
	public WebClient webClient() {
	    return WebClient.builder()
	            .baseUrl(url) // Replace with your base URL
	            .build();
	}

}
