package homework_9.Eduard_Eghiazaryan;

import homework_9.Eduard_Eghiazaryan.annotations.*;

import java.time.LocalDate;

public class CustomerDTO {
    @Length
    private String name;
    @Email
    private String email;
    @Adulthood()
    private LocalDate birthday;
    @Min(0)
    @Max(100)
    private int discountRate;


    public CustomerDTO(String name, String email, LocalDate birthday, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getDiscountRate() {
        return discountRate;
    }
}
