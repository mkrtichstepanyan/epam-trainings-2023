package homework_7.Nona_Asatryan;

public class ProductType {
    public static final ProductType PIZZA = new ProductType("pizza",0);

    public static final ProductType DRINK = new ProductType("drink", 0);
    private String name;
    private double price;

    ProductType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
