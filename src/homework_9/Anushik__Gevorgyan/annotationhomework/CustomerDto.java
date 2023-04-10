package homework_9.Anushik__Gevorgyan.annotationhomework;

import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.*;

import java.time.LocalDate;

public class CustomerDto {
    @Length(min = 4, max = 20)
    private String name;
    @Email
    private String email;
    @Adulthood(age  = 20)
    private LocalDate birthday;
    @Min(minValue= 1)
    @Max(maxValue = 100)
    private int discountRate;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}