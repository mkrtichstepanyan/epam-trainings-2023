package Hovhannes_Abrahamyan.DTO_validation;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Validator validator = new Validator();
        CustomerDto customerDto = new CustomerDto("J", "julian@mail.com",
                LocalDate.of(2012,02,01),  255);

        String[] errors = validator.validateMeth(customerDto);
        System.out.println(Arrays.toString(errors));
    }
}