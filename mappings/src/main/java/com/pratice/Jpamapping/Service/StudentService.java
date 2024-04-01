package com.pratice.Jpamapping.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pratice.Jpamapping.Entity.Laptop;
import com.pratice.Jpamapping.Entity.Student;
import com.pratice.Jpamapping.Repo.LaptopRepo;
import com.pratice.Jpamapping.Repo.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;
    @Autowired
    private LaptopRepo laptopRepo;
    @Transactional // Add transactional annotation to manage the transaction
    public Student saved() {
        Student student = new Student();
        Laptop laptop = new Laptop();
        laptop.setBrand("acer");
        laptop.setCost(36000);

        student.setName("rj");
        student.setAge(22);
        laptop.setStudent(student); // Set the relationship from Laptop to Student

        // Since the relationship is bidirectional, also set the relationship from Student to Laptop
        student.setLaptop(laptop); // Associate the laptop with the student
        laptop.setStudent(student); 

        return repo.save(student);
    }

   
	public Laptop getId(int id) {
		return laptopRepo.findById(id).get();
//				repo.findById(id).get();
	}
	
	public void removeStudent(int id)
	{
		repo.deleteById(id);
	}
}
