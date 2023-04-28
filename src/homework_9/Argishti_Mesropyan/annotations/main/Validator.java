package homework_9.Argishti_Mesropyan.annotations.main;

import homework_9.Argishti_Mesropyan.annotations.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
