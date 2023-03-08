package homework_10.Yeghia_Ansuryan.Palmetto.myExceptions;

public class DoubleIngredientException extends Exception {
    String massage;

    public DoubleIngredientException(String massage) {
        this.massage = massage;
    }

    @Override
    public String toString() {
        return massage;
    }
}
