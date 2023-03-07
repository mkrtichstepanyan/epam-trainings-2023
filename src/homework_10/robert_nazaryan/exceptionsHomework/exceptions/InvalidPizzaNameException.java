package homework_10.robert_nazaryan.exceptionsHomework.exceptions;

public class InvalidPizzaNameException extends Exception{

    @Override
    public String toString() {
        return "Pizza name isn't correct!";
    }
}
