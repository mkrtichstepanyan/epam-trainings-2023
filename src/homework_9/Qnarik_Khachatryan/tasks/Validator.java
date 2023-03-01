package homework_9.Qnarik_Khachatryan.tasks;

import homework_9.Qnarik_Khachatryan.tasks.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
