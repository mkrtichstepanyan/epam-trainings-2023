package homework_9.Argishti_Mesropyan.annotations.main;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) throws IllegalAccessException {
        Custumer customer = new Custumer("Argishti@mail.ru", "Argisht",
                LocalDate.of(1993,03,10), 10);
        CustomerValidator validator = new CustomerValidator();
        System.out.println(validator.validate(customer));
    }
}
