package homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions;

public class ProductQuantityException extends Exception {
    @Override
    public String toString() {
        return "Please, input right quantity of product!";
    }
}
