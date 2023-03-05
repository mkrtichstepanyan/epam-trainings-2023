package homework_9.Vladimir_Vanyan;

import homework_9.Vladimir_Vanyan.annotations.Adulthood;
import homework_9.Vladimir_Vanyan.annotations.Email;
import homework_9.Vladimir_Vanyan.annotations.Length;
import homework_9.garik_gharibyan.assignment.annotations.discount_rate_annimation.Max;
import homework_9.garik_gharibyan.assignment.annotations.discount_rate_annimation.Min;

import java.time.LocalDate;

public class CustomerDto {
    @Email
    private String email;

    @Length
    private String name;
    @Adulthood
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
