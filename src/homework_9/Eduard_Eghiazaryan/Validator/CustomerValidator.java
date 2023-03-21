package homework_9.Eduard_Eghiazaryan.Validator;

import homework_9.Eduard_Eghiazaryan.annotations.*;
import homework_9.Eduard_Eghiazaryan.annotations.procesors.AdulthoodAnnotationProcessor;
import homework_9.Eduard_Eghiazaryan.annotations.procesors.DiscountRateAnnotationProcess;
import homework_9.Eduard_Eghiazaryan.annotations.procesors.EmailAnnotationProcess;
import homework_9.Eduard_Eghiazaryan.annotations.procesors.LengthAnnotationProcess;
import homework_9.Eduard_Eghiazaryan.error.Errors;

import java.lang.reflect.Field;


public class CustomerValidator implements Validator {
    private final Errors errors = new Errors();

    public Errors validate(Object obj) throws IllegalAccessException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(AdulthoodAnnotationProcessor.processAnnotation(obj, field));
            } else if (field.isAnnotationPresent(Length.class)) {
                errors.addError(LengthAnnotationProcess.processAnnotation(obj, field));
            } else if (field.isAnnotationPresent(Email.class)) {
                errors.addError(EmailAnnotationProcess.processAnnotation(obj, field));
            } else if (field.isAnnotationPresent(Min.class) || field.isAnnotationPresent(Max.class)) {
                errors.addError(DiscountRateAnnotationProcess.processAnnotation(obj, field));
            }
        }
        return errors;
    }
}
