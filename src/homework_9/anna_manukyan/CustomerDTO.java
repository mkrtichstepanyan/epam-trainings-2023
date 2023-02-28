package homework_9.anna_manukyan;

import homework_9.anna_manukyan.myAnnotations.*;

import java.time.LocalDate;

public class CustomerDTO {

    @Length(min = 2, max = 30)
    private String name;

    @Email(message = "Please provide a valid email address")
    private String email;

    @Adulthood
    private LocalDate birthDate;

    @Min(0)
    @Max(100)
    private int discountRate;

    public CustomerDTO(String name, String email, LocalDate birthDate, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.discountRate = discountRate;
    }
}
