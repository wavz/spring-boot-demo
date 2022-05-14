package student;

import lombok.Data;

@Data
public class Address {
    private String state;
    private String city;
    private String address;


    public Address(String state, String city, String address) {
        this.state = state;
        this.city = city;
        this.address = address;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
