package homework_9.Yeghia_Ansuryan.annotation_homework.main;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customer = new CustomerDto("myemail@gmail.com", "myName",
                LocalDate.of(2001, 10, 10), 16);
        CustomerValidator validator = new CustomerValidator();
        System.out.println(validator.validate(customer));

    }
}
