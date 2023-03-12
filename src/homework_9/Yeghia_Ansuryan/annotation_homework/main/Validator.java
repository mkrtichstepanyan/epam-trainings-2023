package homework_9.Yeghia_Ansuryan.annotation_homework.main;

import homework_9.Yeghia_Ansuryan.annotation_homework.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
