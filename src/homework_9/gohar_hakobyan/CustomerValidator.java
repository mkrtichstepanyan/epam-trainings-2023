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
            if (field.isAnnotationPresent(Adulthood.class) || field.isAnnotationPresent(Length.class)
                    || field.isAnnotationPresent(Email.class) || field.isAnnotationPresent(Min.class)
                    || field.isAnnotationPresent(Max.class)) {
                EmailAnnotationProcessor emailProcessor = new EmailAnnotationProcessor();
                LengthAnnotationProcessor nameProcessor = new LengthAnnotationProcessor();
                AdulthoodAnnotationProcessor ageProcessor = new AdulthoodAnnotationProcessor();
                DiscountProcessor discountProcessor = new DiscountProcessor();
                errors.addError(emailProcessor.processAnnotation(obj, field));
                errors.addError(nameProcessor.processAnnotation(obj, field));
                errors.addError(ageProcessor.processAnnotation(obj, field));
                errors.addError(discountProcessor.processAnnotation(obj, field));
            }
        }
        return errors;
    }
}
