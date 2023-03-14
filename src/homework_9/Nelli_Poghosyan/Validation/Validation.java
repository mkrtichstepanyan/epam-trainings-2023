package homework_9.Nelli_Poghosyan.Validation;

import homework_9.Nelli_Poghosyan.Annotation.*;
import homework_9.Nelli_Poghosyan.Annotation.Processors.AdultHoodProcessor;
import homework_9.Nelli_Poghosyan.Annotation.Processors.CustomerNameLengthProcessor;
import homework_9.Nelli_Poghosyan.Annotation.Processors.DiscountRateProcessor;
import homework_9.Nelli_Poghosyan.Annotation.Processors.EmailProcessor;
import homework_9.Nelli_Poghosyan.Dto.CustomerDto;

import java.lang.reflect.Field;
import java.time.LocalDate;

public class Validation {
    private Error[] errors;
    private int index;

    public void addError(Error error) {
        Error[] errorItem = new Error[++index];
        errorItem[index - 1] = error;
        if (errors != null) {
            System.arraycopy(errors, 0, errorItem, 0, errors.length);
        }
        errors = errorItem;

    }

    public Error[] getErrors(Object dto) throws IllegalAccessException {
        for (Field field : dto.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getDeclaringClass().getSimpleName().equals("CustomerDto")) {
                CustomerDto customerDto = (CustomerDto) dto;
                if (field.isAnnotationPresent(Length.class)) {
                    addError(CustomerNameLengthProcessor.checkNameIsValid(field, customerDto));
                } else if (field.isAnnotationPresent(Email.class)) {
                    addError(EmailProcessor.checkEmailIsValid(field, customerDto));
                } else if (field.isAnnotationPresent(AdultHood.class)) {
                    addError(AdultHoodProcessor.checkAdultHood(field, customerDto));
                } else if (field.isAnnotationPresent(Min.class) || field.isAnnotationPresent(Max.class)) {
                    addError(DiscountRateProcessor.checkDiscountRate(field, customerDto));
                }
            }
        }
        return errors;
    }


}
