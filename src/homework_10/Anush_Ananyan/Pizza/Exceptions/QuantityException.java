package homework_10.Anush_Ananyan.Pizza.Exceptions;

public class QuantityException extends Exception {

    public String toString() {
        return "You can't order more than 10 products";
    }
}
