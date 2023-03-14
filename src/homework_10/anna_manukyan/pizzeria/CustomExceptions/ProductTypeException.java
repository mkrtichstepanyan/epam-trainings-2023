package homework_10.anna_manukyan.pizzeria.CustomExceptions;

public class ProductTypeException extends Exception {
    @Override
    public String toString() {
        return "Product type can not be null";
    }
}
