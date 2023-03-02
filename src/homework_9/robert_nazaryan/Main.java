package homework_9.robert_nazaryan;


import homework_9.robert_nazaryan.validation.CustomerValidator;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setName("Namee");
        customerDto.setEmail("email@gmail.com");
        customerDto.setBirthday(LocalDate.of(2010,8,2));
        customerDto.setDiscountRate(50);

        CustomerValidator customerValidator = new CustomerValidator();
        System.out.println(customerValidator.validate(customerDto));
    }
}
