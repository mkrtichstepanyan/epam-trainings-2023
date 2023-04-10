package homework_9.garik_gharibyan.assignment;

import homework_9.garik_gharibyan.assignment.error.Errors;
import homework_9.garik_gharibyan.assignment.validatia.CustomerValidator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setName("Jack");
        customerDto.setEmail("Jack@gmail.com");
        customerDto.setBirthday(LocalDate.of(2009,10,15));
        customerDto.setDiscountRate(123);

        CustomerValidator validator = new CustomerValidator();

        Errors errors = validator.validate(customerDto);
        System.out.println(errors);


    }
}
