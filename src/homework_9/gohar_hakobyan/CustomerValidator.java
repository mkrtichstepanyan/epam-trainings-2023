package homework_9.gohar_hakobyan;

import homework_9.gohar_hakobyan.annotations.*;
import homework_9.gohar_hakobyan.annotations.procesors.*;
import homework_9.gohar_hakobyan.error.Errors;

import java.lang.reflect.Field;

// utility classes - does not contain state
public class CustomerValidator implements Validator {

    private Errors errors = new Errors();

    public Errors validate(Object obj) throws IllegalAccessException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {
                AdulthoodAnnotationProcessor ageProcessor = new AdulthoodAnnotationProcessor();
                errors.addError(ageProcessor.processAnnotation(obj, field));
            } else if (field.isAnnotationPresent(Length.class)) {
                LengthAnnotationProcessor nameProcessor = new LengthAnnotationProcessor();
                errors.addError(nameProcessor.processAnnotation(obj, field));
            } else if (field.isAnnotationPresent(Email.class)) {
                EmailAnnotationProcessor emailProcessor = new EmailAnnotationProcessor();
                errors.addError(emailProcessor.processAnnotation(obj, field));
            } else if (field.isAnnotationPresent(Min.class)
                    || field.isAnnotationPresent(Max.class)) {
                DiscountProcessor discountProcessor = new DiscountProcessor();
                errors.addError(discountProcessor.processAnnotation(obj, field));
            }
        }
        return errors;
    }
}
