package com.example.demo.converters;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import student.Student;
import student.StudentDTO;

import java.time.LocalDateTime;

@Service
public class StudentConverter {

    public Student convertStudentDTO(StudentDTO studentDTO){
        return new Student(studentDTO.getFirstName(),
                studentDTO.getLastName(),
                studentDTO.getEmail(),
                LocalDateTime.now());
    }
}
