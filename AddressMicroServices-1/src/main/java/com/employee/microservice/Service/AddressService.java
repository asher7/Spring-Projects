package com.employee.microservice.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.microservice.dao.AddressRepo;
import com.employee.microservice.dto.Address;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepo addressRepo;
	
	public Address getAddressEmployeeId(int id)
	{
		Address employee= addressRepo.findAddressByEmployeeId(id);
		System.err.println(employee);
		return employee;
	}

}
