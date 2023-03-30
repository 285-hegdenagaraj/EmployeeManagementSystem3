package com.example.Entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Login {
	@Id
	private int empid;
	private String location;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Login(int empid, String location) {
		super();
		this.empid = empid;
		this.location = location;
	}
	public Login() {

	}
	@Override
	public String toString() {
		return "Login [empid=" + empid + ", location=" + location + "]";
	}
}
