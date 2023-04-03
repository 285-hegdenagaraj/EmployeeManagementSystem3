package com.example.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Entity.QuickLinks;

public interface Quickrepo extends MongoRepository<QuickLinks, Integer>{

}
