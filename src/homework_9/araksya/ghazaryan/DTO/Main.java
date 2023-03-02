package homework_9.araksya.ghazaryan.DTO;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setName("A");
        customerDto.setEmail("a");
        LocalDate birthDayArmen = LocalDate.of(2011,1,1);
        customerDto.setBirtDay(birthDayArmen);
        customerDto.setDiscountRate(101);
        List<String> errors = Validator.validate(customerDto);
        extracted(errors);
    }

    private static void extracted(List<String> errors) {
        if (errors.isEmpty()){
            System.out.println("Data is valid");
        }else {
            System.out.println("Error : ");
            for (String error : errors) {
                System.out.println(error);
            }
        }
    }
}
