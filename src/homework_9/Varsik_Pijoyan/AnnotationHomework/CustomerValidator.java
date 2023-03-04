package homework_9.Varsik_Pijoyan.AnnotationHomework;

import homework_9.Varsik_Pijoyan.AnnotationHomework.annotations.*;
import homework_9.Varsik_Pijoyan.AnnotationHomework.annotations.processors.*;
import homework_9.Varsik_Pijoyan.AnnotationHomework.errors.Errors;

import java.lang.reflect.Field;

import static homework_9.Varsik_Pijoyan.AnnotationHomework.annotations.processors.AdulthoodAnnotationProcessor.processAnnotation;

public class CustomerValidator implements Validator{
    Errors errors = new Errors();


    @Override
    public Errors validate(Object dto) throws IllegalAccessException {
        Field[] declaredFields = dto.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(processAnnotation(dto, field));
            }
            if (field.isAnnotationPresent(Email.class)) {
                errors.addError(EmailAnnotationProcessor.processAnnotation(dto, field));
            }
            if (field.isAnnotationPresent(Length.class)) {
                errors.addError(LengthAnnotationProcessor.processAnnotation(dto, field));
            }
            if (field.isAnnotationPresent(Max.class)) {
                errors.addError(MaxAnnotationProcessor.processAnnotation(dto, field));
            }
            if (field.isAnnotationPresent(Min.class)) {
                errors.addError(MinAnnotationProcessor.processAnnotation(dto, field));
            }
        }

        return errors;
    }

}
