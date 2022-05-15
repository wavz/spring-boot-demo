package com.example.demo.services;

import com.example.demo.interfaces.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import student.Student;
import com.example.demo.interfaces.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {


    private final StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findStudentByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.insert(student);
    }


}
