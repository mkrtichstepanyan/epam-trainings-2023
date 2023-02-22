package homework_7.ofelya_khachatryan;

public class DrinkType {
    private static final double BASE_PRICE = 3.0;
    public static final DrinkType ALCOHOL =
            new DrinkType("alcohol", BASE_PRICE, 1.5);
    public static final DrinkType NO_ALCOHOL = new DrinkType("no alcohol", BASE_PRICE, 0);

    private String name;
    private double price;
    private double additionalPrice;

    DrinkType(String name, double basePrice, double additionalPrice) {
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
