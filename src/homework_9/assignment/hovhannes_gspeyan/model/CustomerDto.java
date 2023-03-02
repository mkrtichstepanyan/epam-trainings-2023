package homework_9.assignment.hovhannes_gspeyan.model;

import homework_9.assignment.hovhannes_gspeyan.annotations.*;

import java.time.LocalDate;

public class CustomerDto {
    @Length(min = 4, max = 20)
    private String name;
    @Email
    private String email;
    @Adulthood(adultAge = 20)
    private LocalDate birthday;
    @Min(minValue = 1.0)
    @Max(maxValue = 100.0)
    private double discountRate;

    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }
    public LocalDate getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }
    public double getDiscountRate() {
        return discountRate;
    }
}
