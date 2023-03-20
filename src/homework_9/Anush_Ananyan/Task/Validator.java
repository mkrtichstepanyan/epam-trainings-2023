package homework_9.Anush_Ananyan.Task;

import homework_9.Anush_Ananyan.Task.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
