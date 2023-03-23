package homework_9.Anush_Ananyan.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customer = new CustomerDto("m", "com",
                LocalDate.of(2020, 12, 12), -1);

        CustomerValidator validator = new CustomerValidator();

        System.out.println(validator.validate(customer));
    }
}
