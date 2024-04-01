package com.employee.microservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.microservice.dto.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
