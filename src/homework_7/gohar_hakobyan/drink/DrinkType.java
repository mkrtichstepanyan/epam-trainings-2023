package homework_7.gohar_hakobyan.drink;

public class DrinkType {
    private static final double BASE_PRICE = 0.5;

    public static final DrinkType MINERAL =
            new DrinkType("Mineral", BASE_PRICE, 1);
    public static final DrinkType JUICE =
            new DrinkType("Juice", BASE_PRICE, 0.5);
    public static final DrinkType PEPSI =
            new DrinkType("Pepsi", BASE_PRICE, 1.5);

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

    public String getName() {
        return name;
    }
}
