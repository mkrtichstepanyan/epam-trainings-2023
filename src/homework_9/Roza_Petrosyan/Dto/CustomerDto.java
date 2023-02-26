package homework_9.Roza_Petrosyan.Dto;

import homework_9.Roza_Petrosyan.Annotation.*;

import java.time.LocalDate;

public class CustomerDto {
    @NotNull(message = "Customer name can not be null")
    @Length(min = 2, max = 30)
    private String name;
    @NotNull(message = "Customer email can not be null")
    @Email
    private String email;

    @Adulthood
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
