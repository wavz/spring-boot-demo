package student;


import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class StudentDTO {

    private String firstName;
    private String lastName;
    private String email;
    private Gender gender;
    private Address address;
    private List<String> courses;
    private BigDecimal totalSpentInBooks;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }

    public List<String> getCourses() {
        return courses;
    }

    public BigDecimal getTotalSpentInBooks() {
        return totalSpentInBooks;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                ", courses=" + courses +
                ", totalSpentInBooks=" + totalSpentInBooks +
                '}';
    }
}
