package com.example.Entity;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Department {
@Id

private int depid;
private String depName;
public int getDepid() {
	return depid;
}
public void setDepid(int depid) {
	this.depid = depid;
}
public String getDepName() {
	return depName;
}
public void setDepName(String depName) {
	this.depName = depName;
}
public Department(int depid, String depName) {
	super();
	this.depid = depid;
	this.depName = depName;
}
public Department() {
	
}
@Override
public String toString() {
	return "Department [depid=" + depid + ", depName=" + depName + "]";
}
}
