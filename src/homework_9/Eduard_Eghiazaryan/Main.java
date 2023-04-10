package homework_9.Eduard_Eghiazaryan;

import homework_9.Eduard_Eghiazaryan.Validator.CustomerValidator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDTO customer = new CustomerDTO("Eduard", "egiazaryaneduard3@gmail.com", LocalDate.of(2006, 10, 4), 10);
        CustomerValidator validator = new CustomerValidator();
        System.out.println(validator.validate(customer));
    }
}
