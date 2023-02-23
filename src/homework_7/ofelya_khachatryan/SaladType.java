package homework_7.ofelya_khachatryan;

public class SaladType {
    private static final double BASE_PRICE = 5.0;

    public static final SaladType VEGAN = new SaladType("vegetable", BASE_PRICE, 0.0);
    public static final SaladType GOURMET = new SaladType("Cairo", BASE_PRICE, 5.5);

    private String name;
    private double price;
    private double additionalPrice;

    SaladType(String name, double basePrice, double additionalPrice) {
        this.name = name;
        this.price = basePrice + additionalPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
