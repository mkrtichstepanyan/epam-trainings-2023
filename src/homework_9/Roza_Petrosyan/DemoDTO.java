package homework_9.Roza_Petrosyan;
import homework_9.Roza_Petrosyan.Dto.CustomerDto;
import homework_9.Roza_Petrosyan.Dto.ProductDto;
import homework_9.Roza_Petrosyan.Validation.CheckValidation;

import java.time.LocalDate;
import java.util.Arrays;

public class DemoDTO{
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1999, 8, 4);
        CustomerDto customerDto = new CustomerDto(null, null, date, 30);
        ProductDto productDto = new ProductDto("125851", 23333, 15);

        CheckValidation checkValidation = new CheckValidation();
        String[] errors = checkValidation.getErrors(customerDto);
        String[] errors2 = checkValidation.getErrors(productDto);
        System.out.println(Arrays.toString(errors));
        System.out.println(Arrays.toString(errors2));

    }
}
