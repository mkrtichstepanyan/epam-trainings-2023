package homework_9.Argishti_Mesropyan.annotations.main;

import homework_9.Argishti_Mesropyan.annotations.*;


import java.time.LocalDate;
public class Custumer {
    @Email
    private String email;
    @Length(min = 2, max = 30)
    private String name;
    @Adulthood
    private LocalDate birthDay;
    @Min(0)
    @Max(100)
    private int discountRate;

    public Custumer(String email, String name, LocalDate birthDay, int discountRate) {
        this.email = email;
        this.name = name;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }
}
