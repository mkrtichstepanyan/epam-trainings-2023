package homework_9.garik_gharibyan.assignment.validatia;

import homework_9.garik_gharibyan.assignment.error.Errors;

public interface Validator  {
    Errors validate(Object object)throws IllegalAccessException;
}
