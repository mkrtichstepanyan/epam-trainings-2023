package homework_9.Davit_Poghosyan;

import homework_9.Nelli_Poghosyan.Dto.CustomerDto;
import homework_9.Nelli_Poghosyan.Dto.ProductDto;
import homework_9.Nelli_Poghosyan.Validation.Validation;

import java.time.LocalDate;
import java.time.Month;

public class DtoMainDemo {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto("John", "john@gmail.com", LocalDate.of(2011, Month.DECEMBER, 12), 20);
        ProductDto productDto = new ProductDto("Product1", 15.5);
        Validation validate = new Validation();
        Error[] customerErrors = validate.getErrors(customerDto);
        Error[] productErrors = validate.getErrors(productDto);
        for (int i = 0; i < customerErrors.length; i++) {
            System.out.println(customerErrors[i]);
        }
        for (int i = 0; i < productErrors.length; i++) {
            System.out.println(productErrors[i]);

        }
    }


}
