package homework_7.Ani_Barseghyan.exceptions;

public class ProductQuantityException extends Exception {
    public ProductQuantityException() {
        super("You can not order more than 10, default quantity is set to 10");
    }
}
