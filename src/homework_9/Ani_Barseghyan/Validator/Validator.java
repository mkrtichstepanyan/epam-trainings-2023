package homework_9.Ani_Barseghyan.Validator;


import homework_9.Ani_Barseghyan.error.Errors;

public interface Validator {
    Errors validate(Object obj) throws IllegalAccessException;
}
