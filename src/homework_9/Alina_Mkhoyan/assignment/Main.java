package homework_9.Alina_Mkhoyan.assignment;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        LocalDate birthdate = LocalDate.of(2009, 01, 01);
        CustomerDto customerDto = new CustomerDto("A", "argmail.com", birthdate, -1);
        Validator<CustomerDto> customerDtoValidator = new Validator<>();
        System.out.println(customerDtoValidator.validate(customerDto));
    }
}