package com.example.Repository;

import javax.persistence.Id;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Entity.Mygoals;

public interface Goalrepo extends MongoRepository<Mygoals, Integer>{

	void deleteById(Id id);

}
