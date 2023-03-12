package homework_7.Roza_Petrosyan.exceptions.product_exceptions;

public class FullPizzaException extends ProductException{
    public FullPizzaException(){
        super("Pizza is full. You can not add more than 7 ingredients");
    }
}
