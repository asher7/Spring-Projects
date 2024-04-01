package com.pratice.Jpamapping.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratice.Jpamapping.Entity.Address;
import com.pratice.Jpamapping.Entity.Student;
import com.pratice.Jpamapping.Repo.AddressRepo;
import com.pratice.Jpamapping.Repo.StudentRepo;

@Service
public class AddressService {

	@Autowired
	private AddressRepo addressRepo;
	@Autowired
	private StudentRepo studentRepo;

	public void insert() {
		Student student = new Student();
		student.setName("siva");
		student.setAge(22);

		Address address = new Address();
		address.setStreet("4th street");
		address.setCity("rajamundhry");
		address.setCountry("india");
		address.setStudent(student);
		Address address1 = new Address();
		address1.setStreet("5th street");
		address1.setCity("jpt");
		address1.setCountry("india");
		address1.setStudent(student);

		List<Address> list = List.of(address, address1);
		student.setAddress(list);
		studentRepo.save(student);

//		addressRepo.save(address);
	}

	public Student insertStudent(Student student) {
		
		return studentRepo.save(student);
	}

	public Address insert(Address address) {
		return addressRepo.save(address);
	}

	public List<Student> getall() {
		return studentRepo.findAll();
	}

	public List<Address> getAddress() {
		return addressRepo.findAll();
	}

	public void removeAddress(int id) {
		addressRepo.deleteById(id);
		
	}

}
