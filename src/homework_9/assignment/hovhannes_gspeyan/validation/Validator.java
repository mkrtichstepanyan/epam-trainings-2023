package homework_9.assignment.hovhannes_gspeyan.validation;
import homework_9.assignment.hovhannes_gspeyan.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException, NoSuchFieldException;
}
