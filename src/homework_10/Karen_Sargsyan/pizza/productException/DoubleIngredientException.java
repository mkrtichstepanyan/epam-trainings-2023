package homework_10.Karen_Sargsyan.pizza.productException;

public class DoubleIngredientException extends RuntimeException {
    String massage;

    public DoubleIngredientException(String massage) {
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }

}
