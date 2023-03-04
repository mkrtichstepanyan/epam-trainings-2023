package homework_9.Anushik__Gevorgyan.annotationhomework;

import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.*;

import java.time.LocalDate;

public class CustomerDto {
    @Email(" ")
    private String email;
    @Length(min=0,max=10)
    private String name;
    @Adulthood(age = 20)
    private LocalDate birthDay;
    @Max(10)
    @Min(0)
    private int discountRate;



    public CustomerDto(String email, String name, LocalDate birthDay, int discountRate) {
        this.email = email;
        this.name = name;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }
}
