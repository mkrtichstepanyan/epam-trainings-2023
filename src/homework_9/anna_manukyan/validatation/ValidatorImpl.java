package homework_9.anna_manukyan.validatation;


import homework_9.anna_manukyan.annotations.*;
import homework_9.anna_manukyan.error.Errors;
import homework_9.anna_manukyan.procesors.*;

import java.lang.reflect.Field;

public class ValidatorImpl implements Validator{
    private Errors errors = new Errors();
    public Errors validate(Object obj) throws IllegalAccessException {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(Adulthood.class)) {
                    errors.addError(AdulthoodAnnotationProcessor.processAnnotation(obj, field));
                }
                if (field.isAnnotationPresent(Length.class)) {
                    errors.addError(NameAnnotationProcessor.processAnnotation(obj, field));
                }
                if (field.isAnnotationPresent(Max.class)) {
                    errors.addError(MaximumRateAnnotationProcessor.processAnnotation(obj, field));
                }
                if (field.isAnnotationPresent(Min.class)) {
                    errors.addError(MinimumRateAnnotationProcessor.processAnnotation(obj, field));
                }
                if (field.isAnnotationPresent(Email.class)) {
                    errors.addError(EmailAnnotationProcessor.processAnnotation(obj, field));
                }
            }
        return errors;
    }
}
