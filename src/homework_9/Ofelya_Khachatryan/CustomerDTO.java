package homework_9.Ofelya_Khachatryan;

import homework_9.Ofelya_Khachatryan.Length;

import java.time.LocalDate;
import java.util.Optional;

public class CustomerDTO {

    @Length(min = 2, max = 30)
    private String name;
    @Email
    private String email;
    @Adulthood
    private LocalDate birthday;
    @Min(0)
    @Max(100)
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public CustomerDTO(String name, String email, LocalDate birthday, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthday = birthday;
        this.discountRate = discountRate;
    }
}
