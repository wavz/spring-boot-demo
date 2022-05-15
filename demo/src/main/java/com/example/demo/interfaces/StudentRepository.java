package com.example.demo.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import student.Student;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    Student findByEmail(String email);

}
