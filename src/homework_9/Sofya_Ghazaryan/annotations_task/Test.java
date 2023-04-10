package homework_9.Sofya_Ghazaryan.annotations_task;

import homework_9.Sofya_Ghazaryan.annotations_task.dto.CustomerDto;
import homework_9.Sofya_Ghazaryan.annotations_task.validator.Validator;

import java.time.LocalDate;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        CustomerDto customer = new CustomerDto();
        customer.setName("Sofi");
        customer.setEmail("sofi@gmail.com");
        LocalDate birthDay = LocalDate.of(2012, 12, 12);
        customer.setBirtDay(birthDay);
        customer.setDiscountRate(150);
        List<String> errors = Validator.validate(customer);
        extracted(errors);

        CustomerDto customer1 = new CustomerDto();
        customer1.setName("aa");
        customer1.setEmail("casdcas");
        LocalDate birthDay1 = LocalDate.of(2015, 8, 18);
        customer1.setBirtDay(birthDay1);
        customer1.setDiscountRate(32);
        List<String> errors1 = Validator.validate(customer1);
        extracted(errors1);

    }

    private static void extracted(List<String> errors) {
        if (errors.isEmpty()) {
            System.out.println("Customer data is correct");
        } else {
            System.out.println("Errors was found: ");
            for (String error : errors) {
                System.out.println(" " + error);
            }
        }
    }
}