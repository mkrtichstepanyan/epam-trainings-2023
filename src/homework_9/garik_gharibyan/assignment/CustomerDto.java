package homework_9.garik_gharibyan.assignment;

import homework_9.garik_gharibyan.assignment.annotations.Email;
import homework_9.garik_gharibyan.assignment.annotations.Length;

public class CustomerDto {

    @Length
    private String name;
    @Email
    private String email;

    private LocalData birthday;

    private int discountRate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
