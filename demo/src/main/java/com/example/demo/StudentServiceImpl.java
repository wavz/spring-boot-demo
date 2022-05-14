package com.example.demo;

import com.example.demo.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import student.Student;
import student.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {


    private final StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }



}
