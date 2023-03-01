package homework_9.Diana_Melkonyann;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customer = new CustomerDto("diana@mail.ru", "Diana",
                LocalDate.of(2000, 9, 24), 20);
        CustomerValidator validator = new CustomerValidator();
        System.out.println(validator.validate(customer));
    }



}
