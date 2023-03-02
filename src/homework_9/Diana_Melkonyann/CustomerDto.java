package homework_9.Diana_Melkonyann;

import homework_9.Diana_Melkonyann.annotations.*;

import java.time.LocalDate;

public class CustomerDto {
    @Email("")
    private String email;
    @Length(min = 2, max = 30)
    private String name;
    @Adulthood()
    private LocalDate birthDay;
    @Min(0)
    @Max(100)
    private int discountRate;
    public CustomerDto(String email, String name, LocalDate birthDay, int discountRate) {
        this.email = email;
        this.name = name;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }
}
