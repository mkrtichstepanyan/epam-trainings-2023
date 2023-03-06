package homework_10.robert_nazaryan.exceptionsHomework.exceptions;

public class PizzaAmountException extends RuntimeException{

    public PizzaAmountException(){
        super("You can't order more than 10 pizzas in one order!");
    }
}
