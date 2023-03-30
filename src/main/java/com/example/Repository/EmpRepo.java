package com.example.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Entity.Employee;

public interface EmpRepo  extends MongoRepository<Employee, Integer>{

}
