package homework_9.Roza_Petrosyan.annotation_task;
import homework_9.Roza_Petrosyan.annotation_task.dto.*;
import homework_9.Roza_Petrosyan.annotation_task.validation.CustomerValidator;

import java.time.LocalDate;

public class DemoDTO{
    public static void main(String[] args) throws IllegalAccessException{
        LocalDate date = LocalDate.of(2020, 8, 4);
        CustomerDto customerDto = new CustomerDto("J", null, date, -2);
        ProductDto productDto = new ProductDto("125851", 2, 15);

        CustomerValidator customerValidator = new CustomerValidator();
        System.out.println(customerValidator.validate(customerDto));
        System.out.println(customerValidator.validate(productDto));

    }
}
