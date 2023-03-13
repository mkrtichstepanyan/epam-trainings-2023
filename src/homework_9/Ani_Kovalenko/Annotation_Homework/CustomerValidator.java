package homework_9.Ani_Kovalenko.Annotation_Homework;

import homework_9.Ani_Kovalenko.Annotation_Homework.annotations.*;
import homework_9.Ani_Kovalenko.Annotation_Homework.annotations.procesors.AdulthoodAnnotationProcessor;
import homework_9.Ani_Kovalenko.Annotation_Homework.annotations.procesors.EmailAnnotationProcessor;
import homework_9.Ani_Kovalenko.Annotation_Homework.annotations.procesors.LengthAnnotationProcessor;
import homework_9.Ani_Kovalenko.Annotation_Homework.annotations.procesors.MinMaxAnnotationProcessor;
import homework_9.Ani_Kovalenko.Annotation_Homework.error.Errors;

import java.lang.reflect.Field;

public class CustomerValidator implements Validator {

    private Errors errors = new Errors();

    public Errors validate(Object obj) throws IllegalAccessException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(AdulthoodAnnotationProcessor.processAnnotation(obj, field));
            } else if (field.isAnnotationPresent(Email.class)) {
                errors.addError(EmailAnnotationProcessor.processAnnotation(obj, field));
            } else if (field.isAnnotationPresent(Length.class)) {
                errors.addError(LengthAnnotationProcessor.processAnnotation(obj, field));
            } else if (field.isAnnotationPresent(Min.class) || field.isAnnotationPresent(Max.class)) {
                errors.addError(MinMaxAnnotationProcessor.processAnnotation(obj, field));
            }
        }

        return errors;
    }
}
