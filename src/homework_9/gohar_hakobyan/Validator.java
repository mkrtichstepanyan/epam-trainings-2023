package homework_9.gohar_hakobyan;

import homework_9.gohar_hakobyan.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
