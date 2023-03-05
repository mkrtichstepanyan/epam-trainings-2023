package homework_9.Roza_Petrosyan.annotation_task.dto;

import homework_9.Roza_Petrosyan.annotation_task.annotations.*;

import java.time.LocalDate;

public class CustomerDto {
    @Length(min = 2, max = 30)
    private String name;
    @Email
    private String email;

    @Adulthood(age = 20)
    private LocalDate birthDay;

    @Min(value = 0)
    @Max(value = 100)
    private int discountRate;

    public CustomerDto(String name, String email, LocalDate birthDay, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getDiscountRate() {
        return discountRate;
    }
}
