package homework_9.Ani_Barseghyan.Validator;

import homework_9.Ani_Barseghyan.annotations.Adulthood;
import homework_9.Ani_Barseghyan.annotations.procesors.AdulthoodAnnotationProcessor;
import homework_9.Ani_Barseghyan.error.Errors;

import java.lang.reflect.Field;


public class CustomerValidator implements Validator {
    private Errors errors = new Errors();

    public Errors validate(Object obj) throws IllegalAccessException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(AdulthoodAnnotationProcessor.processAnnotation(obj, field));
            }
        }
        return errors;
    }


//    private void checkCustomerName(Field nameField, CustomerDTO customerDTO) {
//        Length length = nameField.getAnnotation(Length.class);
//
//        if (customerDTO.getName().length() < length.min() || customerDTO.getName().length() > length.max()) {
//            addError(length.warningMessage());
//        } else {
//            System.out.println("Customer name is valid");
//        }
//    }
//
//    private void checkCustomerEmail(Field emailField, CustomerDTO customerDTO) {
//        Email email = emailField.getAnnotation(Email.class);
//
//        if (customerDTO.getEmail().matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$")) {
//            System.out.println("Email is valid");
//        } else addError(email.warningMessage());
//    }
//
//    private void checkCustomerAge(Field ageField, CustomerDTO customerDto) {
//        Adulthood age = ageField.getAnnotation(Adulthood.class);
//        if (LocalDate.now().getYear() - customerDto.getBirthday().getYear() > 18) {
//            System.out.println("Customer is adult");
//        } else {
//            addError(age.warningMessage());
//        }
//    }
//
//    private void checkDiscountRate(Field rateField, CustomerDTO customerDTO) {
//        Min minValue = rateField.getAnnotation(Min.class);
//        Max maxValue = rateField.getAnnotation(Max.class);
//
//        if (customerDTO.getDiscountRate() < minValue.value() || customerDTO.getDiscountRate() > maxValue.value()) {
//            addError(minValue.warningMessage() + " " + maxValue.warningMessage());
//        } else {
//            System.out.println("Rate is valid");
//        }
//    }
}
