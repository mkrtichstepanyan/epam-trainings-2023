package homework_9.Eduard_Eghiazaryan.Validator;


import homework_9.Eduard_Eghiazaryan.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
