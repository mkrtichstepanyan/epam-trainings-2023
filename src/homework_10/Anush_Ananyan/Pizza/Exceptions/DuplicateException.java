package homework_10.Anush_Ananyan.Pizza.Exceptions;

public class DuplicateException extends RuntimeException{
    public DuplicateException (){
        super("Please check the order again");
    }
}
