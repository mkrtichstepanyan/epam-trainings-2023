package homework_9.karen_mikayelyan;

import homework_9.karen_mikayelyan.dto.CustomerDto;
import homework_9.karen_mikayelyan.dto.ProductDto;
import homework_9.karen_mikayelyan.validation.CheckValidation;

import java.time.LocalDate;
import java.util.Arrays;

public class DemoDto {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1989, 9, 25);
        CustomerDto customerDto = new CustomerDto(null, null, date, 29);
        ProductDto productDto = new ProductDto("123456", 77777, 12);

        CheckValidation checkValidation = new CheckValidation();
        String[] errors = checkValidation.getErrors(customerDto);
        String[] errors2 = checkValidation.getErrors(productDto);
        System.out.println(Arrays.toString(errors));
        System.out.println(Arrays.toString(errors2));
    }
}
