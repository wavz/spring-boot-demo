package com.example.demo.interfaces;

import student.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student findStudentByEmail(String email);
    void saveStudent(Student student);



}
