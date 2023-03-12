package homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions;

public class ProductTypeException extends Exception {
    @Override
    public String toString() {
        return "Product type can't be null!";
    }
}
