package homework_7.garik_gharibyan.product.food.pizza;

public class PizzaType {
    private static final double BASE_PRICE = 1.0;

    public static final PizzaType REGULAR =
            new PizzaType("regular", BASE_PRICE, 0);
    public static final PizzaType CALZONE =
            new PizzaType("calzone", BASE_PRICE, 0.5);

    private final String name;
    private final double price;

    private PizzaType(String name, double basePrice, double additionalPrice) {
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
