package homework_9.assignment.Zara_Avetyan;


import java.time.LocalDate;


@Length(min = 2, max = 30)
public class CustomerDto {
    @Length(min = 2, max = 30)
    public static String name;

    @Email
    private static String email;

    @Adulthood
    private LocalDate birthDay;

    @Min(0)
    @Max(100)
    private int discountRate;

    public CustomerDto(String name, String email, LocalDate birthDay, int discountRate) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
        this.discountRate = discountRate;
    }
}
