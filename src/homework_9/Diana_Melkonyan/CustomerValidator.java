package homework_9.Diana_Melkonyan;

import homework_9.Diana_Melkonyan.annotations.*;
import homework_9.Diana_Melkonyan.annotations.procesors.*;
import homework_9.Diana_Melkonyan.error.Errors;

import java.lang.reflect.Field;

// utility classes - does not contain state
public class CustomerValidator implements Validator {

    private Errors errors = new Errors();

    public Errors validate(Object obj) throws IllegalAccessException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(AdulthoodAnnotationProcessor.processAnnotation(obj,field));
            }
            if(field.isAnnotationPresent(Email.class)){
                errors.addError(EmailAnnotationProcessor.processAnnotation(obj,field));
            }
            if(field.isAnnotationPresent(Length.class)){
                errors.addError(LengthAnnotationProcessor.processAnnotation(obj,field));
            }
            if(field.isAnnotationPresent(Max.class)){
                errors.addError(MaxAnnotetionProcessor.processAnnotation(obj,field));
            }
            if(field.isAnnotationPresent(Min.class)){
                errors.addError(MinAnnotetionProcessor.processAnnotation(obj,field));
            }
        }

        return errors;
    }
}
