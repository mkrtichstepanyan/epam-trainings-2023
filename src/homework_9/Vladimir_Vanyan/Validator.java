package homework_9.Vladimir_Vanyan;

import homework_9.Vladimir_Vanyan.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
