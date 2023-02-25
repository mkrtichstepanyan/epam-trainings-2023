package classwork;

public class Drink extends Product {
    public Drink() {
        super("name", 1);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }
}
