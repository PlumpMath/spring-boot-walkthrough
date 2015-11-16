package hello;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;

    public Customer() {}

    public Customer(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    public void setId(Integer id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    @Override
    public String toString() {
        return String.format("Customer(id=%s, firstName=%s, lastName=%s)",
                             id, firstName, lastName);
    }
}
