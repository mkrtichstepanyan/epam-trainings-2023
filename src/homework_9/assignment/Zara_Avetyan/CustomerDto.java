package homework_9.assignment.Zara_Avetyan.Homework;

import homework_9.assignment.Zara_Avetyan.Homework.*;

import java.lang.reflect.Field;
import java.time.LocalDate;


@Length(min = 2, max = 30)
public class CustomerDto {
    @Length(min = 2, max = 30)
    public static String name;

    @Email
    private static String email;

    @Adulthood
    private LocalDate birthDay;

    @Min(0)
    @Max(100)
    private int discountRate;

    CustomerDto(String name, String email, LocalDate birthDay, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }
}
