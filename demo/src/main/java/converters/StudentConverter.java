package converters;

import lombok.AllArgsConstructor;
import student.Student;
import student.StudentDTO;

import java.time.LocalDateTime;

@AllArgsConstructor
public class StudentConverter {

    public Student convertStudentDTO(StudentDTO studentDTO){
        return new Student(studentDTO.getFirstName(),
                studentDTO.getLastName(),
                studentDTO.getEmail(),
                studentDTO.getGender(),
                studentDTO.getAddress(),
                studentDTO.getCourses(),
                studentDTO.getTotalSpentInBooks(),
                LocalDateTime.now());
    }
}
