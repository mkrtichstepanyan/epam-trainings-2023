package homework_9.Qnarik_Khachatryan.tasks;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class Validator {

    public static void main(String[] args) throws IllegalAccessException {
        CustomerDTO customerDTO = new CustomerDTO("Hi", "arail.ru", 13, 110);

        validate(customerDTO);

    }


    public static void validate(CustomerDTO customerDTO) throws IllegalAccessException {

        List errorList = new ArrayList();

        for (Field field : customerDTO.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Length.class)) {
                String name = (String) field.get(customerDTO);
                Length annotation = field.getAnnotation(Length.class);
                int minValue = annotation.minValue();
                int maxValue = annotation.maxValue();
                if (name.length() > maxValue || name.length() < minValue) {
                    errorList.add("The length of the name doesn't match the specified range!");
                }
            }

            if (field.isAnnotationPresent(Email.class)) {
                String customerEmail = (String) field.get(customerDTO);
                if (!customerEmail.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}" +
                        "[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$")) {
                    errorList.add("Incorrect email address!");
//                    System.out.println("Incorrect email address!");
                }
            }
            if (field.isAnnotationPresent(Adulthood.class)) {
                int customerAge = (int) field.get(customerDTO);
                Adulthood annotation = field.getAnnotation(Adulthood.class);
                int majorityAge = annotation.value();
                if (customerAge < majorityAge) {
                    errorList.add("Sorry, you must reach the age of majority!");
                }

            }
            if (field.isAnnotationPresent(Min.class)) {
                int discountRate = (int) field.get(customerDTO);
                Min annotation = field.getAnnotation(Min.class);
                int min = annotation.value();
                if (discountRate < min) {
                    errorList.add("The number is less than the limit!");
                }
            }

            if (field.isAnnotationPresent(Max.class)) {
                int discountRate = (int) field.get(customerDTO);
                Max annotation = field.getAnnotation(Max.class);
                int max = annotation.value();
                if (discountRate > max) {
                    errorList.add("The number exceed the limit!");
                }
            }
        }
        System.out.println(errorList);
    }
}

