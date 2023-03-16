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
    private Errors errors = new Errors();

    public Errors validate(Object obj) throws IllegalAccessException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(AdultHood.class)) {
                errors.addError(AdultHoodProcessor.processAnnotation(obj, field));
            }
            else if (field.isAnnotationPresent(Length.class)) {
                errors.addError(CustomerNameLengthProcessor.processAnnotation(obj, field));
            }
            else if (field.isAnnotationPresent(Email.class)) {
                errors.addError(EmailProcessor.processAnnotation(obj, field));
            }
            else if (field.isAnnotationPresent(Max.class)|| field.isAnnotationPresent(Min.class)) {
                errors.addError(DiscountRateProcessor.processAnnotation(obj, field));
            }
        }
        return errors;
    }
}

