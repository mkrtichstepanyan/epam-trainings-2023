package homework_9.anna_manukyan;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDTO customerDTO=new CustomerDTO("V","valod.valod@gmail.com", LocalDate.of(2016, 9, 23),200);
        List<String> validate = Validator.validate(customerDTO);
        for (String s : validate) {
            System.out.println(s);
        }
    }
}
