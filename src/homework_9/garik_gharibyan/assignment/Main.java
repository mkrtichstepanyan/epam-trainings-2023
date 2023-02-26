package homework_9.garik_gharibyan.assignment;

import homework_9.garik_gharibyan.assignment.annotations.Email;
import homework_9.garik_gharibyan.assignment.annotations.Length;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setName("Jack");
        customerDto.setEmail("Jack@gmail.com");

        if(isValidNameLength(customerDto)){
            System.out.println(customerDto.getName()+ " - valid name");
        }

        if (isValidEmail(customerDto)){
            System.out.println(customerDto.getEmail() + " - valid email");
        }

    }

    static boolean isValidEmail(CustomerDto customerDto) throws IllegalAccessException {
        Field[] declaredFields = customerDto.getClass().getDeclaredFields();
        for (Field field:declaredFields) {
            if (field.isAnnotationPresent(Email.class)){
                field.setAccessible(true);

                String regex = field.getAnnotation(Email.class).email();
                String email = (String) field.get(customerDto);
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(email);
                boolean isMatch = matcher.find();
                if (!isMatch){
                    System.out.println(email + " - invalid email");
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isValidNameLength(CustomerDto customerDto) throws IllegalAccessException {

        Field[] declaredFields = customerDto.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                String name = (String) field.get(customerDto);

                int min = field.getAnnotation(Length.class).min();
                int max = field.getAnnotation(Length.class).max();

                if (name.length() > max) {
                    System.out.println(name + " - length of name is long " + max);
                    return false;
                } else if (name.length() < min) {
                    System.out.println(name + " - length of name is short " + min);
                    return false;
                }
            }
        }
        return true;
    }

}
