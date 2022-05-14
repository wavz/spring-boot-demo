package student;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Data
@Document
public class Student {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private Address address;
    private List<String> courses;
    private BigDecimal totalSpentInBooks;
    private LocalDateTime created;


    public Student(){

    }
    public Student(String firstName,
                   String lastName,
                   String email,
                   Gender gender,
                   Address address,
                   List<String> courses,
                   BigDecimal totalSpentInBooks,
                   LocalDateTime created) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.courses = courses;
        this.totalSpentInBooks = totalSpentInBooks;
        this.created = created;
    }
}
