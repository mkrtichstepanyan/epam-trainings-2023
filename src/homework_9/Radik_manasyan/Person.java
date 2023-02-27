package homework_9.Radik_manasyan;

import homework_9.Radik_manasyan.annotations.*;

import java.time.LocalDate;

public class Person {
//    @Length(min = 2, max = 30)
    private String name;
    @Email
    private String email;
    @Adulthood
    private LocalDate birthDay;
    @Min(0)
    @Max(100)
    private int discountRate;

    Person (String name, String email, LocalDate birthDay, int discountRate){
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }

}
