package com.feuji.bootWithAngular.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feuji.bootWithAngular.entity.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	List<Student> findByNameContaining(String name);

}
