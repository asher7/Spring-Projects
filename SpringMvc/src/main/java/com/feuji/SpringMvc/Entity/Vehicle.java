package com.feuji.SpringMvc.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.lang.NonNull;

@Entity
	@Table(name = "vehicles")
	public class Vehicle {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@NotBlank(message = "not empty")
		private String vehicleNO;
		
		@Column(name = "no_of-tires")
		
		private int tires;
		
		@NotEmpty(message = "field cannot be empty")
		private String driverName;

		public Vehicle() {
			// TODO Auto-generated constructor stub
		}
		public Vehicle(String vehicleNO, int tires, String driverName) {
			super();
			this.vehicleNO = vehicleNO;
			this.tires = tires;
			this.driverName = driverName;
		}

		

		public String getVehicleNO() {
			return vehicleNO;
		}
		public void setVehicleNO(String vehicleNO) {
			this.vehicleNO = vehicleNO;
		}
		public int getTires() {
			return tires;
		}
		public void setTires(int tires) {
			this.tires = tires;
		}
		public String getDriverName() {
			return driverName;
		}
		public void setDriverName(String driverName) {
			this.driverName = driverName;
		}
		@Override
		public String toString() {
			return "Vehicle [vehicleNO=" + vehicleNO + ", tires=" + tires + ", driverName=" + driverName + "]";
		}
		
		
		

}
