package homework_10.robert_nazaryan.exceptionsHomework.exceptions;

public class InvalidPizzaNameException extends Exception{

    public InvalidPizzaNameException(){
        super("Pizza name isn't correct!");
    }
}
