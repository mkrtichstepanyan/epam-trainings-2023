package homework_9.Anushik__Gevorgyan.annotationhomework;

import homework_9.Anushik__Gevorgyan.annotationhomework.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException, NoSuchFieldException;
}