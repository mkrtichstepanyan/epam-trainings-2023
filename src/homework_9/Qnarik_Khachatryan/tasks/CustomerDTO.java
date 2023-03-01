package homework_9.Qnarik_Khachatryan.tasks;


import homework_9.Qnarik_Khachatryan.tasks.annotations.*;

import java.time.LocalDate;

class CustomerDTO {
    @Length(min = 2, max = 30)
    private String name;

    @Email("")
    private String email;

    @Adulthood
    private LocalDate birthday;

    @Min(0)
    @Max(100)
    private int discountRate;


    CustomerDTO(String name, String email, LocalDate birthday, int discountRate) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.discountRate = discountRate;
    }
}
