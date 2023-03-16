package homework_9.TatevKocharyan.chapter12.annotationsHomework;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto("Poxos","myemail@gmail.com",
                LocalDate.of(2000,12,15),10);
        Validator validator=new Validator();
         System.out.println(validator.validate(customerDto));
    }
}
