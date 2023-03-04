package homework_9.robert_nazaryan.validation;

import homework_9.robert_nazaryan.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException, NoSuchFieldException;
}
