package homework_9.karen_mikayelyan.validation;

import homework_9.karen_mikayelyan.annotation.*;
import homework_9.karen_mikayelyan.dto.*;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class CheckValidation implements Validator {
    private String[] errors;
    private int index = 0;

    private void addError(String error) {
        String[] temp = new String[++index];
        temp[index - 1] = error;

        if (errors != null) {
            System.arraycopy(errors, 0, temp, 0, errors.length);
        }
        errors = temp;
    }

    @Override
    public String[] getErrors(Object dto) {
        for (Field field : dto.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getDeclaringClass().getSimpleName().equals("CustomerDto")) {
                CustomerDto customerDto = (CustomerDto) dto;
                if (field.isAnnotationPresent(Length.class)) {
                    checkCustomerName(field, customerDto);

                } else if (field.isAnnotationPresent(Email.class)) {
                    checkCustomerEmail(field, customerDto);

                } else if (field.isAnnotationPresent(Adulthood.class)) {
                    checkCustomerAge(field, customerDto);

                } else if (field.isAnnotationPresent(Min.class) || field.isAnnotationPresent(Max.class)) {
                    checkDiscountRate(field, customerDto);
                }
            } else if (field.getDeclaringClass().getSimpleName().equals("ProductDto")) {
                ProductDto productDto = (ProductDto) dto;

                if (field.isAnnotationPresent(Length.class)) {
                    checkProductName(field, productDto);

                } else if (field.isAnnotationPresent(Min.class) || field.isAnnotationPresent(Max.class)) {
                    checkProductQuantity(field, productDto);
                }
            }
        }

        return errors;
    }

    private void checkCustomerName(Field field, CustomerDto customerDto) {
        Length length = field.getAnnotation(Length.class);
        NotNull notNull = field.getAnnotation(NotNull.class);
        if (customerDto.getName() == null) {
            addError(notNull.message());
        } else {
            if (customerDto.getName().length() < length.min() || customerDto.getName().length() > length.max()) {
                addError(length.message());
            } else {
                System.out.println("Customer name is valid");
            }
        }
    }

    private void checkCustomerEmail(Field field, CustomerDto customerDto) {
        Email email = field.getAnnotation(Email.class);
        NotNull notNull = field.getAnnotation(NotNull.class);
        if (customerDto.getEmail() == null) {
            addError(notNull.message());
        } else {
            if (customerDto.getEmail().matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9]" +
                    "(?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?" +
                    "(?:\\.[a-zA-Z0-9]" +
                    "(?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$")) {
                System.out.println("Customer email is valid");
            } else {
                addError(email.message());
            }
        }
    }

    private void checkCustomerAge(Field field, CustomerDto customerDto) {
        Adulthood adulthood = field.getAnnotation(Adulthood.class);
        if (LocalDate.now().getYear() - customerDto.getBirthDay().getYear() > 18) {
            System.out.println("Customer is adult");
        } else {
            addError(adulthood.message());
        }
    }

    private void checkDiscountRate(Field field, CustomerDto customerDto) {
        Min min = field.getAnnotation(Min.class);
        Max max = field.getAnnotation(Max.class);
        if (customerDto.getDiscountRate() < min.value() || customerDto.getDiscountRate() > max.value()) {
            addError(min.message() + ". " + max.message());
        } else {
            System.out.println("Discount rate is valid");
        }
    }

    private void checkProductName(Field field, ProductDto productDto) {
        Length length = field.getAnnotation(Length.class);

        if (productDto.getName().length() < length.min() || productDto.getName().length() > length.max()
                || !productDto.getName().matches("\\p{IsLatin}+")) {
            addError(length.message());
        } else {
            System.out.println("Product name is valid");
        }
    }

    private void checkProductQuantity(Field field, ProductDto productDto) {
        Min min = field.getAnnotation(Min.class);
        Max max = field.getAnnotation(Max.class);

        if (productDto.getQuantity() < min.value() || productDto.getQuantity() > max.value()) {
            addError(min.message() + ". " + max.message());
        } else {
            System.out.println("Product quantity is valid");
        }
    }
}
