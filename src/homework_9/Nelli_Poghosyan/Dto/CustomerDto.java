package homework_9.Nelli_Poghosyan.Dto;

import homework_9.Nelli_Poghosyan.Annotation.*;
import java.time.LocalDate;

public class CustomerDto {
    @Length(min=3,max=30)
    private String name;

    @Email
    private String email;

    @AdultHood
    private LocalDate birthday;

    @Min(value = 0)
    @Max(value = 100)
    private int discountRate;

    public CustomerDto(String name, String email, LocalDate birthday, int discountRate){
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.discountRate = discountRate;
    }

    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
    public int getDiscountRate(){
        return discountRate;
    }
}
