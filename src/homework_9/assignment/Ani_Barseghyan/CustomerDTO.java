package homework_9.assignment.Ani_Barseghyan;

import homework_9.assignment.Ani_Barseghyan.Annotations.*;

import java.time.LocalDate;

public class CustomerDTO {
    @Length
    private String name;
    @Email
    private String email;
    @Adulthood
    private LocalDate birthday;

    @Min(0)
    @Max(100)
    private int discountRate;

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
