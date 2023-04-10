package homework_7.Roza_Petrosyan.exceptions.product_exceptions;

public class ProductQuantityException extends ProductException{
    public ProductQuantityException() {
        super("You can not order more than 10 pizzas!");
    }
}
