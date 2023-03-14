package homework_10.anna_manukyan.pizzeria.CustomExceptions;

public class ProductQuantityException extends Exception {
    public ProductQuantityException() {
        System.out.println("Please input correct quantity");
    }
}
