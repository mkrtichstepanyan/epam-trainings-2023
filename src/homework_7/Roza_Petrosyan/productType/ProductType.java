package homework_7.Roza_Petrosyan.productType;

public class ProductType {
    private String name;
    private double price;

    ProductType(String name, double price) {
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
