package classwork.annotationhomework;

import classwork.annotationhomework.annotations.Adulthood;
import classwork.annotationhomework.annotations.procesors.AdulthoodAnnotationProcessor;
import classwork.annotationhomework.error.Errors;

import java.lang.reflect.Field;

// utility classes - does not contain state
public class CustomerValidator implements Validator {

    private Errors errors = new Errors();

    public Errors validate(Object obj) throws IllegalAccessException {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Adulthood.class)) {
                errors.addError(AdulthoodAnnotationProcessor.processAnnotation(obj, field));
            }
        }

        return errors;
    }
}
