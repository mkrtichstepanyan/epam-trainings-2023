package homework_9.Radik_manasyan;

import homework_9.Radik_manasyan.annotations.*;
import homework_9.Radik_manasyan.annotations.processors.*;
import homework_9.Radik_manasyan.errors.Errors;

import java.lang.reflect.Field;

public class PersonValidator {
    private final Errors errors = new Errors();

    public Errors isValidate(Object person) throws IllegalAccessException {
        for (Field field : person.getClass().getDeclaredFields()) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(Length.class)) {
                errors.addError(LengthAnnotationProcessor.lengthProcessor(person, field));

            } else if (field.isAnnotationPresent(Email.class)) {
                errors.addError(EmailAnnotationProcessor.emailProcessor(person, field));

            } else if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(AdulthoodAnnotationProcessor.adulthoodProcessor(person, field));

            } else if (field.isAnnotationPresent(Min.class)) {
                errors.addError(MinAndMaxAnnotationProcessor.minProcessor(person, field));

            }
        }
        return errors;
    }
}


