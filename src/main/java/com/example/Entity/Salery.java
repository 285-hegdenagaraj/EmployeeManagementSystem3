package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document
public class Salery {
	@Id
	private int employeeId;
	private String Name;
	private double salery;
	private String email;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalery() {
		return salery;
	}
	public void setSalery(double salery) {
		this.salery = salery;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Salery(int employeeId, String name, double salery, String email) {
		super();
		this.employeeId = employeeId;
		Name = name;
		this.salery = salery;
		this.email = email;
	}
	public Salery() {

	}
	@Override
	public String toString() {
		return "Salery [employeeId=" + employeeId + ", Name=" + Name + ", salery=" + salery + ", email=" + email + "]";
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
