package com.example.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Entity.Department;

public interface Deprepo  extends MongoRepository<Department, Integer>{

}
