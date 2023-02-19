package homework_7.Roza_Petrosyan;

public class DrinkType {

    public static final DrinkType NATURAL =
            new DrinkType("Natural", 1.5);
    public static final DrinkType FIZZY =
            new DrinkType("Fizzy", 1);
    public static final DrinkType ALCOHOLIC =
            new DrinkType("Alcoholic", 2);

    private String name;
    private double price;

    DrinkType(String name, double basePrice) {
        this.name = name;
        this.price = basePrice;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
