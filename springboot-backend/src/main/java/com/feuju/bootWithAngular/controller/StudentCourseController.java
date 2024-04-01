package com.feuju.bootWithAngular.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feuji.bootWithAngular.entity.Courses;
import com.feuji.bootWithAngular.entity.Student;
import com.feuji.bootWithAngular.repo.CourseRepository;
import com.feuji.bootWithAngular.repo.StudentRepository;



@RestController

public class StudentCourseController {

	private StudentRepository studentRepository;

	private CourseRepository coursesRepository;

	public StudentCourseController(StudentRepository studentRepository,CourseRepository coursesRepository) {
		this.coursesRepository=coursesRepository;
		this.studentRepository=studentRepository;

	}

	@PostMapping("/insert")
	public Student saveStudent(@RequestBody Student student)
	{
		return studentRepository.save(student);
	}
	@GetMapping("/getall")
	public List<Student> getAll()
	{
		return studentRepository.findAll();
	}
	
	@GetMapping("/getone/{id}")
	public Student getOne(@PathVariable Integer id)
	{
		
		return  studentRepository.findById(id).orElse(null);
	}
}
