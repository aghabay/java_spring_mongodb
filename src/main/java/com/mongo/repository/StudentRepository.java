package com.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.entity.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
