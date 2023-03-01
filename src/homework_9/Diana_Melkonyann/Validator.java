package homework_9.Diana_Melkonyann;

import homework_9.Diana_Melkonyan.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
