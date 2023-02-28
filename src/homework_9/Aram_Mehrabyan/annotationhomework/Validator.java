package homework_9.Aram_Mehrabyan.annotationhomework;

import homework_9.Aram_Mehrabyan.annotationhomework.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
