package com.example.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Entity.Login;

public interface loginrepo extends MongoRepository<Login, Integer>{

}
