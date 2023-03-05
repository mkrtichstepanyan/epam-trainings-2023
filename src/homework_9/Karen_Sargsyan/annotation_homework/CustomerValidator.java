package homework_9.Karen_Sargsyan.annotation_homework;

import homework_9.Karen_Sargsyan.annotation_homework.annotations.Adulthood;
import homework_9.Karen_Sargsyan.annotation_homework.annotations.Email;
import homework_9.Karen_Sargsyan.annotation_homework.annotations.Length;
import homework_9.Karen_Sargsyan.annotation_homework.annotations.Max;
import homework_9.Karen_Sargsyan.annotation_homework.annotations.procesors.*;
import homework_9.Karen_Sargsyan.annotation_homework.error.Errors;

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
