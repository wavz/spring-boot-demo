package com.example.demo.controllers;

import com.example.demo.StudentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import student.Student;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentRestController {


    private com.example.demo.StudentServiceImpl StudentServiceImpl;

    @RequestMapping("/api/v1/students")
    public List<Student> fetchAllStudents() {
        return StudentServiceImpl.findAll();
    }


}
