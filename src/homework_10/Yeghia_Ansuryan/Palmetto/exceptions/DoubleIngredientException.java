package homework_10.Yeghia_Ansuryan.Palmetto.exceptions;

public class DoubleIngredientException extends RuntimeException {
    String massage;

    public DoubleIngredientException(String massage) {
        this.massage = massage;
    }

    @Override
    public String getMessage() {
        return massage;
    }
}
