package homework_9.assignment.Ani_Barseghyan.Validator;

import homework_9.assignment.Ani_Barseghyan.Annotations.*;
import homework_9.assignment.Ani_Barseghyan.CustomerDTO;

import java.lang.reflect.Field;
import java.time.LocalDate;


public class Validator {
    private String[] errors;
    private int index;

    public void addError(String error) {
        String[] temp = new String[++index];
        temp[index - 1] = error;

        errors = temp;

    }

    public String[] getErrors(CustomerDTO customerDTO) {
        for (Field field : customerDTO.getClass().getDeclaredFields()) {
            if (field.getClass().isAnnotationPresent(Length.class)) {
                checkCustomerName(field, customerDTO);
            }
        }

        return errors;
    }


    private void checkCustomerName(Field nameField, CustomerDTO customerDTO) {
        Length length = nameField.getAnnotation(Length.class);

        if (customerDTO.getName().length() < length.min() || customerDTO.getName().length() > length.max()) {
            addError(length.warningMessage());
        } else {
            System.out.println("Customer name is valid");
        }
    }

    private void checkCustomerEmail(Field emailField, CustomerDTO customerDTO) {
        Email email = emailField.getAnnotation(Email.class);

        if (customerDTO.getEmail().matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$")) {
            System.out.println("Email is valid");
        } else addError(email.warningMessage());
    }

    private void checkCustomerAge(Field ageField, CustomerDTO customerDto) {
        Adulthood age = ageField.getAnnotation(Adulthood.class);
        if (LocalDate.now().getYear() - customerDto.getBirthday().getYear() > 18) {
            System.out.println("Customer is adult");
        } else {
            addError(age.warningMessage());
        }
    }

    private void checkDiscountRate(Field rateField, CustomerDTO customerDTO) {
        Min minValue = rateField.getAnnotation(Min.class);
        Max maxValue = rateField.getAnnotation(Max.class);

        if (customerDTO.getDiscountRate() < minValue.value() || customerDTO.getDiscountRate() > maxValue.value()) {
            addError(minValue.warningMessage() + " " + maxValue.warningMessage());
        } else {
            System.out.println("Rate is valid");
        }
    }
}
