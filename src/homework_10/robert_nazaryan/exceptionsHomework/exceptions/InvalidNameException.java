package homework_10.robert_nazaryan.exceptionsHomework.exceptions;

public class InvalidNameException extends RuntimeException {

    public InvalidNameException(){
        super("Name isn't correct!");
    }
}
