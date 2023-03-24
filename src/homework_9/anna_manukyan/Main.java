package homework_9.anna_manukyan;



import homework_9.anna_manukyan.model.CustomerDTO;
import homework_9.anna_manukyan.validatation.ValidatorImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDTO customer = new CustomerDTO("V", "v", LocalDate.of(2016, 9, 23), 200000);
        ValidatorImpl validator = new ValidatorImpl();
        System.out.println(validator.validate(customer));
    }
}
