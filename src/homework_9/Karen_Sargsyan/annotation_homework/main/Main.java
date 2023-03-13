package homework_9.Karen_Sargsyan.annotation_homework.main;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customer = new CustomerDto("myemail@gmail.com", "myName",
                LocalDate.of(2000, 12, 12), 10);
        CustomerValidator validator = new CustomerValidator();
        System.out.println(validator.validate(customer));
    }

}
