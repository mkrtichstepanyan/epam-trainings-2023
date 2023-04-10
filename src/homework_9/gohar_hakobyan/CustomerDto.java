package homework_9.gohar_hakobyan;

import homework_9.gohar_hakobyan.annotations.*;

import java.time.LocalDate;

public class CustomerDto {
    @Email
    private String email;
    @Length(min = 3, max = 10)
    private String name;
    @Adulthood(age = 20)
    private LocalDate birthDay;
    @Min
    @Max
    private int discountRate;


    public CustomerDto(String email, String name, LocalDate birthDay, int discountRate) {
        this.email = email;
        this.name = name;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }
}
