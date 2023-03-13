package homework_9.Yeghia_Ansuryan.annotation_homework.main;

import homework_9.Yeghia_Ansuryan.annotation_homework.annotations.*;

import java.time.LocalDate;

public class CustomerDto {
    @Email
    private String email;
    @Length(min = 2, max = 30)
    private String name;

    @Adulthood
    private LocalDate birthDay;
    @Max(100)
    @Min(0)
    private int discountRate;

    public CustomerDto(String email, String name, LocalDate birthDay, int discountRate) {
        this.email = email;
        this.name = name;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }
}
