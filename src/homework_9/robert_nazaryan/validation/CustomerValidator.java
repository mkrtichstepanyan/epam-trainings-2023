package homework_9.robert_nazaryan.validation;

import homework_9.robert_nazaryan.annotations.*;
import homework_9.robert_nazaryan.annotations.processors.AdulthoodAnnotationProcessor;
import homework_9.robert_nazaryan.annotations.processors.DiscountRateAnnotationProcessor;
import homework_9.robert_nazaryan.annotations.processors.EmailAnnotationProcessor;
import homework_9.robert_nazaryan.annotations.processors.NameLengthAnnotationProcessor;
import homework_9.robert_nazaryan.error.Errors;

import java.lang.reflect.Field;
public class CustomerValidator implements Validator {
    private final Errors errors = new Errors();

    public Errors validate(Object obj) throws IllegalAccessException, NoSuchFieldException {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Length.class)) {
                errors.addError(NameLengthAnnotationProcessor.processAnnotation(obj,field));
            } else if (field.isAnnotationPresent(Email.class)) {
                errors.addError(EmailAnnotationProcessor.processAnnotation(obj,field));
            } else if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(AdulthoodAnnotationProcessor.processAnnotation(obj,field));
            } else if (field.isAnnotationPresent(Min.class) || field.isAnnotationPresent(Max.class)) {
                errors.addError(DiscountRateAnnotationProcessor.processAnnotation(obj,field));
            }
        }
        return errors;
    }
}

