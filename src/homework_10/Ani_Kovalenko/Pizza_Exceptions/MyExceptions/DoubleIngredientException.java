package homework_10.Ani_Kovalenko.Pizza_Exceptions.MyExceptions;

public class DoubleIngredientException extends Exception {
    String message;

    public DoubleIngredientException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
