package homework_9.Qnarik_Khachatryan.tasks;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDTO customer = new CustomerDTO("myName", "myemail@mail.com",
                LocalDate.of(2015, 12, 12), 0);
        CustomerValidator validator = new CustomerValidator();
        System.out.println(validator.validate(customer));

    }


}
