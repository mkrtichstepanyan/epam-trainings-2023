package homework_7.robert_nazaryan;

public class PizzaType {
    private static final double BASE_PRICE = 1.0;

    public static final PizzaType REGULAR =
            new PizzaType("regular", BASE_PRICE, 0);
    public static final PizzaType CALZONE =
            new PizzaType("calzone", BASE_PRICE, 0.5);

    private String name;
    private double price;

    private double additionalPrice;

    PizzaType(String name, double basePrice, double additionalPrice) {
        this.name = name;
        this.price = basePrice + additionalPrice;
    }
    public String getName(){
        return name;
    }

    public double getPrice() {
        return price;
    }
}
