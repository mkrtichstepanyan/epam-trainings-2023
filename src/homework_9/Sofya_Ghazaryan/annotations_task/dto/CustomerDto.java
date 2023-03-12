package homework_9.Sofya_Ghazaryan.annotations_task.dto;

import homework_9.Sofya_Ghazaryan.annotations_task.annotations.*;

import java.time.LocalDate;

public class CustomerDto {
    @Length(min = 2, max = 30)
    private String name;
    @Email
    private String email;
    @Adulthood
    private LocalDate birtDay;

    @Min(0)
    @Max(100)
    private int discountRate;


    public CustomerDto(String name, String email, LocalDate birtDay, int discountRate) {
        this.name = name;
        this.email = email;
        this.birtDay = birtDay;
        this.discountRate = discountRate;
    }

    public CustomerDto() {
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

    public LocalDate getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(LocalDate birtDay) {
        this.birtDay = birtDay;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}
