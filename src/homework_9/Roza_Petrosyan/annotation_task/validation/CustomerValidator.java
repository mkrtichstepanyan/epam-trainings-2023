package homework_9.Roza_Petrosyan.annotation_task.validation;

import homework_9.Roza_Petrosyan.annotation_task.annotations.*;
import homework_9.Roza_Petrosyan.annotation_task.annotations.processors.*;
import homework_9.Roza_Petrosyan.annotation_task.error.Errors;

import java.lang.reflect.Field;

// utility classes - does not contain state
public class CustomerValidator implements Validator {

    private Errors errors = new Errors();

    @Override
    public Errors validate(Object obj) throws IllegalAccessException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(new AdulthoodAnnotationProcessor().processAnnotation(obj, field));
            } else if (field.isAnnotationPresent(Email.class)) {
                errors.addError(new EmailAnnotationProcessor().processAnnotation(obj, field));
            } else if (field.isAnnotationPresent(Length.class)) {
                errors.addError(new CustomerAndProductNameAnnotationProcessor().processAnnotation(obj, field));
            } else if (field.isAnnotationPresent(Min.class) || field.isAnnotationPresent(Max.class)) {
                errors.addError(new DiscountRateAndQuantityAnnotationProcess().processAnnotation(obj, field));
            }
        }

        return errors;
    }
}
