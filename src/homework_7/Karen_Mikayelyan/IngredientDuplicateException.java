package homework_7.Karen_Mikayelyan;

public class IngredientDuplicateException extends Exception {

    IngredientDuplicateException(){
        super("This ingredient is already exists, please remove!");
    }
}
