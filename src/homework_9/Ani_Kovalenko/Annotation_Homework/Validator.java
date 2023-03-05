package homework_9.Ani_Kovalenko.Annotation_Homework;

import homework_9.Ani_Kovalenko.Annotation_Homework.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
