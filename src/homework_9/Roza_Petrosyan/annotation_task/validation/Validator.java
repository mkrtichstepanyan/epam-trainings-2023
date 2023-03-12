package homework_9.Roza_Petrosyan.annotation_task.validation;

import homework_9.Roza_Petrosyan.annotation_task.error.Errors;

@FunctionalInterface
public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
