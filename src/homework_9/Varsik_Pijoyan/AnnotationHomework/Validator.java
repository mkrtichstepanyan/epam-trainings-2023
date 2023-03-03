package homework_9.Varsik_Pijoyan.AnnotationHomework;

import homework_9.Varsik_Pijoyan.AnnotationHomework.errors.Errors;

public interface Validator {
    Errors validate(Object dto) throws IllegalAccessException;
}
