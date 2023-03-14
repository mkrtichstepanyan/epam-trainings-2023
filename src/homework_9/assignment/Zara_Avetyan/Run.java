package homework_9.assignment.Zara_Avetyan;



import java.time.LocalDate;

public class Run {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto("Name",
                "name.surname@gmail.com",
                LocalDate.of(1836, 3, 14),
                50);
        Validator validator = new Validator(customerDto);
        Errors.print();
    }
}
