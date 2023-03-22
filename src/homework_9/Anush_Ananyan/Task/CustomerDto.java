package homework_9.Anush_Ananyan.Task;

import homework_9.Anush_Ananyan.Task.annotations.*;

import java.time.LocalDate;

public class CustomerDto {
    @Length(min = 2, max = 10)
    private String name;

    @Email()
    private String email;
    @Adulthood(age = 20)
    private LocalDate birthday;

    @Min(0)
    @Max(100)
    private int discountRate;


    public CustomerDto(String name, String email, LocalDate birthday, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.discountRate = discountRate;
    }
}
