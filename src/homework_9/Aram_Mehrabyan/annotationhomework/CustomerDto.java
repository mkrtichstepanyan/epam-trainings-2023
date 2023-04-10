package homework_9.Aram_Mehrabyan.annotationhomework;

import homework_9.Aram_Mehrabyan.annotationhomework.annotations.Adulthood;
import homework_9.Aram_Mehrabyan.annotationhomework.annotations.Email;
import homework_9.Aram_Mehrabyan.annotationhomework.annotations.Length;
import homework_9.Aram_Mehrabyan.annotationhomework.annotations.Min;
import homework_9.Aram_Mehrabyan.annotationhomework.annotations.Max;

import java.time.LocalDate;

public class CustomerDto {
    @Email(email = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
    private String email;
    @Length(min = 2, max = 30)
    private String name;
    @Adulthood(age = 20)
    private LocalDate birthDay;
    @Min(0)
    @Max(100)
    private int discountRate;


    public CustomerDto(String email, String name, LocalDate birthDay, int discountRate) {
        this.email = email;
        this.name = name;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }
}
