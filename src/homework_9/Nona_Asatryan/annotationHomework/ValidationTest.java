package homework_9.Nona_Asatryan.annotationHomework;

import java.time.LocalDate;

public class ValidationTest {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto dto = new CustomerDto("Jack", "jack@gmail.com", LocalDate.of(2007, 3, 12), 200);

        String[] errors = Validator.validate(dto);

        for (String error : errors) {
            if(error != null){
                System.out.println("error: " + error);
            }else {
                System.out.println("Validation has passed!");
            }
        }
    }
}
