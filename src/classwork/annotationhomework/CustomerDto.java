package classwork.annotationhomework;

import classwork.annotationhomework.annotations.Adulthood;

import java.time.LocalDate;

public class CustomerDto {
    private String email;
    private String name;
    @Adulthood(age = 20)
    private LocalDate birthDay;
    private int discountRate;



    public CustomerDto(String email, String name, LocalDate birthDay, int discountRate) {
        this.email = email;
        this.name = name;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }
}
