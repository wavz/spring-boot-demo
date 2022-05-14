package student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    void saveStudent(Student student);



}
