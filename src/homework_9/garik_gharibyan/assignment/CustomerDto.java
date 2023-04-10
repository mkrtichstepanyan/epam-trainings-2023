package homework_9.garik_gharibyan.assignment;

import homework_9.garik_gharibyan.assignment.annotations.birthday_annotation.Adulthood;
import homework_9.garik_gharibyan.assignment.annotations.email_annotation.Email;
import homework_9.garik_gharibyan.assignment.annotations.name_annotatuion.Length;
import homework_9.garik_gharibyan.assignment.annotations.discount_rate_annimation.Max;
import homework_9.garik_gharibyan.assignment.annotations.discount_rate_annimation.Min;

import java.time.LocalDate;

public class CustomerDto {

    @Length(min = 3, max = 15)
    private String name;
    @Email()
    private String email;

    @Adulthood()
    private LocalDate birthday;
    @Min()
    @Max()
    private int discountRate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

}
