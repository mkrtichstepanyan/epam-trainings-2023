package homework_7.Karen_Mikayelyan;

public class IngredientQuantityException extends Exception {
    IngredientQuantityException() {
        super("The pizza's ingredients maximum number has already completed");
    }
}
