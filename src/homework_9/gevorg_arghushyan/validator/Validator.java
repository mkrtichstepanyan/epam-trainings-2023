package homework_9.gevorg_arghushyan.validator;

import gevorg_arghushyan.error.Errors;

public interface Validator {

    Errors validate(Object obj) throws IllegalAccessException;
}
