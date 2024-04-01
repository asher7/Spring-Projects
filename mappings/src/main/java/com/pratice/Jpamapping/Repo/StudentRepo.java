package com.pratice.Jpamapping.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratice.Jpamapping.Entity.Laptop;
import com.pratice.Jpamapping.Entity.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

	

	
}
