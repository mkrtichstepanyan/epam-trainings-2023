package homework_9.anna_manukyan;

import homework_9.anna_manukyan.myAnnotations.*;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static homework_9.anna_manukyan.myAnnotations.Email.regex;

public class Validator {
    static List<String> errors = new ArrayList<>();

    public static List<String> validate(Object dto) throws IllegalAccessException {
        if (dto instanceof CustomerDTO) {
            for (Field field : dto.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                validName(field, (CustomerDTO) dto);
                validEmail(field, (CustomerDTO) dto);
                validAge(field, (CustomerDTO) dto);
                validMinDiscountRate(field, (CustomerDTO) dto);
                validMaxDiscountRate(field, (CustomerDTO) dto);
            }
        }
        return errors;
    }

    private static void validName(Field field, CustomerDTO dto) throws IllegalAccessException {
        if (field.getAnnotation(Length.class) != null) {
            String name = (String) field.get(dto);
            Length annotation = field.getAnnotation(Length.class);
            int max = annotation.max();
            int min = annotation.min();
            if (name.length() < min || name.length() > max) {
                errors.add("Name of Customer " + name +
                        " must have min " + min + " and max " + max + "length");
            }
        }
    }

    private static void validEmail(Field field, CustomerDTO dto) throws IllegalAccessException {
        if (field.getAnnotation(Email.class) != null) {
            String email = (String) field.get(dto);
            Email annotation = field.getAnnotation(Email.class);
            boolean matches = regex.matcher(email).matches();
            if (!matches) {
                errors.add("The " + email + " is not valid email.");
            }
        }
    }

    private static void validAge(Field field, CustomerDTO dto) throws IllegalAccessException {
        if (field.getAnnotation(Adulthood.class) != null) {
            LocalDate localDate = (LocalDate) (field.get(dto));
            int birthday = (int) localDate.toEpochDay();
            int now = (int) LocalDate.now().toEpochDay();
            int age = (now - birthday) / 365;
            Adulthood ageAnnotation = field.getAnnotation(Adulthood.class);
            int value = ageAnnotation.value();
            if (value > age) {
                errors.add("Customer age is " + age +
                        ". It must not be less then " + value + " age ");
            }
        }
    }

    private static void validMaxDiscountRate(Field field, CustomerDTO dto) throws IllegalAccessException {
        if (field.getAnnotation(Max.class) != null) {
            int max = (int) field.get(dto);
            Max annotation = field.getAnnotation(Max.class);
            int value = annotation.value();
            if (max > value) {
                errors.add("Customer discount rate (" + max + ") must  be less then " + value);
            }
        }
    }

    private static void validMinDiscountRate(Field field, CustomerDTO dto) throws IllegalAccessException {
        if (field.getAnnotation(Min.class) != null) {
            int min = (int) field.get(dto);
            Min annotation = field.getAnnotation(Min.class);
            int value = annotation.value();
            if (min < value) {
                errors.add("Customer discount rate (" + min + ") must not be less then " + value);
            }
        }
    }
}
