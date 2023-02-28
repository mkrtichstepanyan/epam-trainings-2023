package homework_9.Nona_Asatryan.annotationHomework;

import homework_9.Nona_Asatryan.annotationHomework.constraints.*;

import java.time.LocalDate;

public class CustomerDto {

    @Length(min = 3, max = 18)
    private String name;

    @Email
    private String email;

    @Adulthood
    private LocalDate birthdate;

    @Min(minValue = 1.0)
    @Max(maxValue = 100.0)
    private double discountRate;

    public CustomerDto(String name, String email, LocalDate birthdate, double discountRate) {
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
        this.discountRate = discountRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
}
