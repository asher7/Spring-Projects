package com.feuji.bootWithAngular.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feuji.bootWithAngular.entity.Courses;



@Repository
public interface CourseRepository extends JpaRepository<Courses, Integer> {
	
	List<Courses> findByfeeLessThan(double fee);

}
