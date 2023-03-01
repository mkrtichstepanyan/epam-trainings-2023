package homework_9.gevorg_arghushyan;

import gevorg_arghushyan.dto.CustomerDto;
import gevorg_arghushyan.validator.CustomerValidator;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        //Fail case
        CustomerDto customer = new CustomerDto("m", "sss", LocalDate.of(2008, 12, 12), -50);
        CustomerValidator validator = new CustomerValidator();
        System.out.println(validator.validate(customer));
         // Success case
        CustomerDto customer2 = new CustomerDto("Gevorg", "arghushyan@email.com", LocalDate.of(1993, 12, 12), 50);
        CustomerValidator validator2 = new CustomerValidator();
        System.out.println(validator2.validate(customer2));
    }
}
