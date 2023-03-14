package homework_10.Anush_Ananyan.Pizza.Exceptions;

public class PizzaFullException extends RuntimeException {
    public PizzaFullException (){
        super("The pizza is already full");
    }

}
