package homework_9.gevorg_arghushyan.dto;



import homework_9.gevorg_arghushyan.anotation.*;

import java.time.LocalDate;

public class CustomerDto {
    @Length
    private String name;
    @Email
    private String email;
    @Adulthood(age = 20)
    private LocalDate birtDate;
    @Min(min = 0)
    @Max(max = 100)
    private int discountRate;

    public CustomerDto(String name, String email, LocalDate birtDate, int discountRate) {
        this.name = name;
        this.email = email;
        this.birtDate = birtDate;
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

    public LocalDate getBirtDate() {
        return birtDate;
    }

    public void setBirtDate(LocalDate birtDate) {
        this.birtDate = birtDate;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }
}
