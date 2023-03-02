package homework_9.Diana_Melkonyann;

import homework_9.Diana_Melkonyann.annotations.*;

import java.time.LocalDate;

public class CustomerDto {
    @Email
    private String email;
    @Length(min = 3, max = 20)
    private String name;
    @Adulthood()
    private LocalDate birthDay;
    @Min()
    @Max()
    private int discountRate;
    public CustomerDto(String email, String name, LocalDate birthDay, int discountRate) {
        this.email = email;
        this.name = name;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }
}
