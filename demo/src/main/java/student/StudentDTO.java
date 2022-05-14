package student;


import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class StudentDTO {

    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }


}
