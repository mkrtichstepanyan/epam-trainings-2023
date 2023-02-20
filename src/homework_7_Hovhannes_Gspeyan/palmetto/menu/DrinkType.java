package homework_7_Hovhannes_Gspeyan.palmetto.menu;

public class DrinkType {

    private static final double BASE_PRICE = 0.0;

    public static final DrinkType WATER_DRINK =
            new DrinkType("Water", BASE_PRICE, 1);
    public static final DrinkType JUICE_DRINK =
            new DrinkType("Apple juice", BASE_PRICE, 2.0);
    public static final DrinkType SODA_DRINK =
            new DrinkType("Cola", BASE_PRICE,1.5);
    public static final DrinkType ALCOHOL_DRINK =
            new DrinkType("Vodka", BASE_PRICE,2.5);
    public static final DrinkType MINERAL_DRINK =
            new DrinkType("Mineral", BASE_PRICE,1.5);


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
