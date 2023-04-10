package homework_9.Karen_Sargsyan.annotation_homework.main;

import homework_9.Karen_Sargsyan.annotation_homework.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
