package homework_7.rafik_pahlevanyan.ordering_system.product;

public class ProductType {
    public String name;

    public double price;

    public ProductType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}