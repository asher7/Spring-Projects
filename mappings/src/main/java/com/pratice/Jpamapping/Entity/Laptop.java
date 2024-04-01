package com.pratice.Jpamapping.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lappy")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int serialNo;
    private String brand;
    private double cost;

   @JsonManagedReference
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
     @JoinColumn(name = "student_id")
    private Student student;

   
   
	public int getSerialNo() {
	return serialNo;
}



public void setSerialNo(int serialNo) {
	this.serialNo = serialNo;
}



public String getBrand() {
	return brand;
}



public void setBrand(String brand) {
	this.brand = brand;
}



public double getCost() {
	return cost;
}



public void setCost(double cost) {
	this.cost = cost;
}



public Student getStudent() {
	return student;
}



public void setStudent(Student student) {
	this.student = student;
}



	@Override
	public String toString() {
		return "Laptop [serialNo=" + serialNo + ", brand=" + brand + ", cost=" + cost + ", student=" + student + "]";
	}
  
     
   

}
