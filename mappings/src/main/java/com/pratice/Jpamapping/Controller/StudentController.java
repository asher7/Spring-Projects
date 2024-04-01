package com.pratice.Jpamapping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.Jpamapping.Entity.Address;
import com.pratice.Jpamapping.Entity.Laptop;
import com.pratice.Jpamapping.Entity.Student;
import com.pratice.Jpamapping.Repo.StudentRepo;
import com.pratice.Jpamapping.Service.AddressService;
import com.pratice.Jpamapping.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	@Autowired
	private AddressService addressService;
	
	@PostMapping("/insert")
	public String insert()
	{
		System.err.println(studentService.saved());
		
		return "Inserted";
	}
	
	
	@PostMapping("/inserted")
	public Address insertingPostMan(@RequestBody Address address)
	{
		return addressService.insert(address);
	}
	
	
	@ResponseBody
	@GetMapping("id/{id}")
	public Laptop getId( @PathVariable int id)
	{
		Laptop lap=studentService.getId(id);
		System.err.println(lap);
	return lap;
	}
	
	@PostMapping("studentinsert")
	public Student inserted(@RequestBody Student student)
	{
		
		return addressService.insertStudent(student);
	}
	
	@GetMapping("get")
	public List<Student> fetch()
	{
		// return addressService.getAddress();
		return addressService.getall();
	}
	@DeleteMapping("delete/{id}")
	public String remove(@PathVariable int id)
	{
		addressService.removeAddress(id);
		return "deleted";
	}
	@DeleteMapping("deletestud/{id}")
	public String removeStudent(@PathVariable int id)
	{
		studentService.removeStudent(id);
		return "deleted";
	}
}
