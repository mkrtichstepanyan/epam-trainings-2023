package classwork;

// contract
public abstract class Product  {

    private static final int COUNT = 0;

    private String name;
    private int quantity;

    public abstract double calculatePrice();

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
