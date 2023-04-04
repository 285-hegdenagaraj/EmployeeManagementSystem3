package com.example.Repository;

import javax.persistence.Id;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Entity.Salery;

public interface Saleryrepo extends MongoRepository<Salery, Integer> {

	void deleteById(Id id);

}
