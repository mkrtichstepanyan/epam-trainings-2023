package homework_9.rafik_pahlevanyan.dto_validation;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        CustomerDto customerDto = new CustomerDto();
        customerDto.setName("s");
        customerDto.setEmail("asdfgas");
        LocalDate birthDay = LocalDate.of(2010,1,1);
        customerDto.setBirtDay(birthDay);
        customerDto.setDiscountRate(120);
        List<String> errors = Validator.validate(customerDto);
        extracted(errors);

        CustomerDto customerDto1 = new CustomerDto();
        customerDto1.setName("Armen");
        customerDto1.setEmail("armen@gmail.com");
        LocalDate birthDayArmen = LocalDate.of(1995,2,8);
        customerDto1.setBirtDay(birthDayArmen);
        customerDto1.setDiscountRate(58);
        List<String> errors1 = Validator.validate(customerDto1);
        extracted(errors1);

    }

    private static void extracted(List<String> errors) {
        if (errors.isEmpty()){
            System.out.println("Customer data is valid");
        }else {
            System.out.println("Errors found: ");
            for (String error : errors) {
                System.out.println("- " + error);
            }
        }
    }
}