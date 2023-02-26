package homework_9.anna_manukyan;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDTO customerDTO1 = new CustomerDTO("V", "v", LocalDate.of(2016, 9, 23), 200000);
        List<String> validate = Validator.validate(customerDTO1);
        for (String s : validate) {
            System.out.println(s);
        }
    }
}
