package homework_7.Roza_Petrosyan;

public abstract class Product {
    private String name;
    private int quantity;

    Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public abstract double calculatePrice();

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
