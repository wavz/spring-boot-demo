package com.example.demo.controllers;

import com.example.demo.converters.StudentConverter;
import com.example.demo.services.StudentServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import student.Student;
import student.StudentDTO;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentRestController {


    private StudentServiceImpl studentServiceImpl;
    @Autowired
    private StudentConverter studentConverter;

    @RequestMapping("/api/v1/students")
    public List<Student> fetchAllStudents() {
        return studentServiceImpl.findAll();
    }

    @PostMapping("/saveUser")
    public StudentDTO saveUser(@RequestBody StudentDTO studentDTO){
        System.out.println(studentDTO);
        studentServiceImpl.saveStudent(studentConverter.convertStudentDTO(studentDTO));
        return studentDTO;
    }


}
