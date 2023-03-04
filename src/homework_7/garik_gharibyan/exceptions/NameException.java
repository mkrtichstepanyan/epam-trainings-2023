package homework_7.garik_gharibyan.exceptions;

public class NameException extends PizzaException{
    public NameException(){
        super("name must be in [A-Z][a-z]+ format");
    }

}
