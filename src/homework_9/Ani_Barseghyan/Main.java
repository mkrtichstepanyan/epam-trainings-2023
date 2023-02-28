package homework_9.Ani_Barseghyan;

import homework_9.Ani_Barseghyan.Validator.CustomerValidator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDTO customer = new CustomerDTO("Ani", "myEmail@gmail.com", LocalDate.of(2000, 12, 12), 10);
        CustomerValidator validator = new CustomerValidator();
        System.out.println(validator.validate(customer));
    }
}
