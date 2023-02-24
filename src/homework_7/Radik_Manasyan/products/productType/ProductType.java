package homework_7.Radik_Manasyan.products.productType;

public class ProductType {
    private String name;
    private double price;

    public ProductType() {
    }

    public ProductType(String name, double basePrice, double additionalPrice) {
        this.name = name;
        this.price = basePrice + additionalPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
