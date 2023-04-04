package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Entity
@Document
public class Mygoals {
	@Id
	private int employeeId;
	private String desc;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Mygoals(int employeeId, String desc) {
		super();
		this.employeeId = employeeId;
		this.desc = desc;
	}
	public Mygoals() {

	}
	@Override
	public String toString() {
		return "Mygoals [employeeId=" + employeeId + ", desc=" + desc + "]";
	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return null;
	}

}
