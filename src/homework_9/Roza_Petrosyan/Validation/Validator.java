package homework_9.Roza_Petrosyan.Validation;

@FunctionalInterface
public interface Validator {
    String[] getErrors(Object dto);
}
