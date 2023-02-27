package homework_9.karen_mikayelyan.validation;

@FunctionalInterface
public interface Validator {
    String[] getErrors(Object dto);
}
