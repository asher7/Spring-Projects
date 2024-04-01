package com.employee.microservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.microservice.dto.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {
	
	@Query( nativeQuery = true, value = "SELECT * FROM employeemicroservice.address a join  employeemicroservice.employee e on e.employee_id=a.employee_id where a.employee_id=:employeeId")
Address findAddressByEmployeeId(@Param("employeeId") int employeeId);

}
