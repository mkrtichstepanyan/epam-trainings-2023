package homework_9.Anushik__Gevorgyan.annotationhomework;


import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.Adulthood;
import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.Email;
import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.Length;
import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.Max;
import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.procesors.AdulthoodAnnotationProcessor;
import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.procesors.EmailAnnotationProcessor;
import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.procesors.LengthAnnotationProcessor;
import homework_9.Anushik__Gevorgyan.annotationhomework.annotations.procesors.MaxAnnotationProcessor;
import homework_9.Anushik__Gevorgyan.annotationhomework.error.Errors;

import java.lang.reflect.Field;

public class CustomerValidator implements Validator {
    private final Errors errors = new Errors();

    public Errors validate(Object obj) throws IllegalAccessException, NoSuchFieldException {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Length.class)) {
                errors.addError(LengthAnnotationProcessor.processAnnotation(obj,field));
            } else if (field.isAnnotationPresent(Email.class)) {
                errors.addError(EmailAnnotationProcessor.processAnnotation(obj,field));
            } else if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(AdulthoodAnnotationProcessor.processAnnotation(obj,field));
            } else if (field.isAnnotationPresent(Max.class)) {
                errors.addError(MaxAnnotationProcessor.processAnnotation(obj,field));
            }
        }
        return errors;
    }
}
