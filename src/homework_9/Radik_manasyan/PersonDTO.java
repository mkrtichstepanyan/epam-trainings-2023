package homework_9.Radik_manasyan;

import homework_9.Radik_manasyan.annotations.*;

import java.time.LocalDate;

public class PersonDTO {
    @Length(min = 2, max = 30)
    private final String name;
    @Email
    private final String email;
    @Adulthood
    private final LocalDate birthDay;
    @Min(0)
    @Max(100)
    private final int discountRate;

    PersonDTO(String name, String email, LocalDate birthDay, int discountRate){
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }

}
