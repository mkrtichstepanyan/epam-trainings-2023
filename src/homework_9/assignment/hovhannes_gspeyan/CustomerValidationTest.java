package homework_9.assignment.hovhannes_gspeyan;

import homework_9.assignment.hovhannes_gspeyan.model.CustomerDto;
import homework_9.assignment.hovhannes_gspeyan.validation.CustomerValidator;

import java.time.LocalDate;


public class CustomerValidationTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setName("pod");
        customerDto.setEmail("pod89");
        customerDto.setBirthday(LocalDate.of(2018,12,12));
        customerDto.setDiscountRate(50.0);

        CustomerValidator customerValidator = new CustomerValidator();
        System.out.println(customerValidator.validate(customerDto));
    }
}
