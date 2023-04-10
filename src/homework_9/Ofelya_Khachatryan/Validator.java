package homework_9.Ofelya_Khachatryan;

import java.lang.reflect.*;
import java.time.LocalDate;
import java.time.Period;

public class Validator {

    private static final String REGEX = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$\n";

    public String[] validate(CustomerDTO customer) throws Exception {
        Class<? extends CustomerDTO> customerClass = customer.getClass();
        Field name = customerClass.getDeclaredField("name");
        Length annotation = name.getAnnotation(Length.class);
        int max = annotation.max();
        int min = annotation.min();
        if (customer.getName().length() > max || customer.getName().length() < min) {
            System.out.println("Invalid name!");

        }
        Field email = customerClass.getDeclaredField("email");
        Email emailAnnotation = email.getAnnotation(Email.class);
        if (emailAnnotation != null) {
            if (!customer.getEmail().matches(REGEX)) {
                System.out.println("Invalid email!");
            }
        }

        Field discountRate = customerClass.getDeclaredField("discountRate");
        Max maxAnnotation = discountRate.getAnnotation(Max.class);
        Min minAnnotation = discountRate.getAnnotation(Min.class);
        if (customer.getDiscountRate() > maxAnnotation.value() || customer.getDiscountRate() < minAnnotation.value()) {
            System.out.println("Invalid discount rate!");
        }

        Field birthday = customerClass.getDeclaredField("birthday");
        Adulthood adulthoodAnnotation = birthday.getAnnotation(Adulthood.class);
        if (adulthoodAnnotation != null) {
            int years = Period.between(customer.getBirthday(), LocalDate.now()).getYears();
            if (years < 18) {
                System.out.println("Invalid Birth Date!");
            }
        }


        return new String[5];
    }

    public static void main(String[] args) throws Exception {
        Validator validator = new Validator();
        validator.validate(new CustomerDTO("Jane Smith", "smithJane88@mail.ru", LocalDate.of(1988, 12, 10), 30));
    }


}



