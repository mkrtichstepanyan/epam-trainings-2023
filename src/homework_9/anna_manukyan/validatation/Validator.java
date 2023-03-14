package homework_9.anna_manukyan.validatation;

import homework_9.anna_manukyan.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
