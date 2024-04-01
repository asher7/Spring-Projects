package com.employee.microservice.Service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.employee.microservice.FeignClient.AddressClient;
import com.employee.microservice.dao.EmployeeRepo;
import com.employee.microservice.dto.Address;
import com.employee.microservice.dto.Employee;
import com.employee.microservice.dto.EmployeeResponse;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private WebClient webClient;
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private AddressClient addressClient;
	
	public EmployeeResponse getEmployeeId(int id)
	{
		Employee employee= employeeRepo.findById(id).get();
		EmployeeResponse employeeResponse= modelMapper.map(employee, EmployeeResponse.class);
		//Address	address=restTemplate.getForObject("http://localhost:8082/location/{id}",Address.class ,id);
//		Address	address=webClient.get()
//		        .uri("/location/{id}", id)  // Replace with the appropriate endpoint and ID
//		        .retrieve()
//		        .bodyToMono(Address.class)
//		        .block();
		ResponseEntity<Address> response=addressClient.getAddressByEmployeeId(id);
		Address address= response.getBody();
		employeeResponse.setAddress(address);
		return employeeResponse;
	
	}

}
