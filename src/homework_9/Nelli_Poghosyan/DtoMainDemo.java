package homework_9.Nelli_Poghosyan;

import homework_9.Nelli_Poghosyan.Dto.CustomerDto;
import homework_9.Nelli_Poghosyan.Dto.ProductDto;
import homework_9.Nelli_Poghosyan.Validation.Validation;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class DtoMainDemo {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto("John", "john@gmail.com", LocalDate.of(2009, Month.DECEMBER, 12), 5);
        Validation validator = new Validation();
        System.out.println(validator.validate(customerDto));
        }

    }



