package homework_7.garik_gharibyan.exceptions;

public class CustomerNumberException extends RuntimeException{
    public CustomerNumberException(){
        super("Already have many customer");
    }
}
