package homework_9.assignment.hovhannes_gspeyan;

import homework_9.assignment.hovhannes_gspeyan.model.CustomerDto;
import homework_9.assignment.hovhannes_gspeyan.validation.Validator;

import java.time.LocalDate;


public class CustomerValidationTest {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        CustomerDto dto = new CustomerDto();
        dto.setName("John");
        dto.setEmail("johnexam@gcgh.ru");
        dto.setBirthday(LocalDate.of(2018, 1, 1));
        dto.setDiscountRate(300);

        String[] errors = Validator.validate(dto);

        for (String error : errors) {
            if(error != null){
                System.out.println("error: " + error);
            }else {
                System.out.println("validation process has successfully passed ");
            }
        }
    }
}
