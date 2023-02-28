package homework_9.garik_gharibyan.assignment;

import homework_9.garik_gharibyan.assignment.annotations.Email;
import homework_9.garik_gharibyan.assignment.annotations.Length;
import homework_9.garik_gharibyan.assignment.annotations.Max;
import homework_9.garik_gharibyan.assignment.annotations.Min;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    private int topElement = -1;

    public Error[] validate(CustomerDto customerDto) throws IllegalAccessException {
        Error[] errors = new Error[4];

        Error nameError = isValidNameLength(customerDto);
        if (nameError != null) {
            errors[++topElement] = nameError;
        }
        Error emailError = isValidEmail(customerDto);
        if (emailError != null) {
            errors[++topElement] = emailError;
        }
        Error discountRateError = isValidDiscountRate(customerDto);
        if (discountRateError != null) {
            errors[++topElement] = discountRateError;
        }
        return errors;
    }


    private Error isValidNameLength(CustomerDto customerDto) throws IllegalAccessException {

        Field[] declaredFields = customerDto.getClass().getDeclaredFields();

        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Length.class)) {
                field.setAccessible(true);
                String name = (String) field.get(customerDto);

                int min = field.getAnnotation(Length.class).min();
                int max = field.getAnnotation(Length.class).max();

                if (name.length() > max) {
                    Error error = new Error(name + " - length of name is long " + max);
                    return error;
                } else if (name.length() < min) {
                    Error error = new Error(name + " - length of name is short " + min);
                    return error;
                }
            }
        }
        return null;
    }

    private Error isValidEmail(CustomerDto customerDto) throws IllegalAccessException {
        Field[] declaredFields = customerDto.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Email.class)) {
                field.setAccessible(true);

                String regex = field.getAnnotation(Email.class).email();
                String email = (String) field.get(customerDto);
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(email);
                boolean isMatch = matcher.find();
                if (!isMatch) {
                    Error error = new Error(email + " - invalid email");
                    return error;
                }
            }
        }
        return null;
    }

    private Error isValidDiscountRate(CustomerDto customerDto) throws IllegalAccessException {
        Field[] declaredFields = customerDto.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            if (field.isAnnotationPresent(Max.class) && field.isAnnotationPresent(Min.class)) {
                field.setAccessible(true);
                int rate = (int) field.get(customerDto);
                int min = field.getAnnotation(Min.class).min();
                int max = field.getAnnotation(Max.class).max();
                if (rate < min || rate > max) {
                    Error error = new Error("Discount rate can be in rate [" + min + "-" + max + "]");
                    return error;
                }
            }
        }
        return null;
    }


}
