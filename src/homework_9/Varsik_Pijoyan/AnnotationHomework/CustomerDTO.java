package homework_9.Varsik_Pijoyan.AnnotationHomework;

import homework_9.Varsik_Pijoyan.AnnotationHomework.annotations.*;

import java.time.LocalDate;

public class CustomerDTO {
    @Length(min = 2, max = 30)
    private String name;

    @Email
    private String email;

    @Adulthood(age = 20)
    private LocalDate birthDate;

    @Min(0)
    @Max(100)
    private int discountRate;

    public CustomerDTO(String email, String name, LocalDate birthDay, int discountRate) {
        this.email = email;
        this.name = name;
        this.birthDate= birthDay;
        this.discountRate = discountRate;
    }

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}
