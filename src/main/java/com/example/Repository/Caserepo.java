package com.example.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Entity.Cases;

public interface Caserepo extends MongoRepository<Cases, Integer>{

}
