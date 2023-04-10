package homework_9.TatevKocharyan.chapter12.annotationsHomework;

import homework_9.TatevKocharyan.chapter12.annotationsHomework.annotations.*;

import java.time.LocalDate;

public class CustomerDto {
    @Length(min = 2, max = 30)
    private String name;
    @Email
    private String email;
    @Adulthood
    private LocalDate birthday;
    @Min
    @Max
    private int discountRate;

    public CustomerDto(String name, String email, LocalDate birthday, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.discountRate = discountRate;
    }


}
