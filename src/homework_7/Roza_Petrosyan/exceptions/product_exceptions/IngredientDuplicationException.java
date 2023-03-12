package homework_7.Roza_Petrosyan.exceptions.product_exceptions;

public class IngredientDuplicationException extends ProductException{
    public IngredientDuplicationException(){
        super("Please check your order again. Ingredients are duplicated!");
    }
}
