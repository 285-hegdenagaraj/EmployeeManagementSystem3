package com.example.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Entity.ApplyLeave;

public interface Leaverepo extends MongoRepository<ApplyLeave, Integer>{

}
