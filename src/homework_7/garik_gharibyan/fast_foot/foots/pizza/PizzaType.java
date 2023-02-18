package homework_7.garik_gharibyan.fast_foot.foots.pizza;

public class PizzaType {

    private static final double BASE_PRICE = 1;
    private static final double CLOSED_PRICE = BASE_PRICE + 0.5;

    public static PizzaType regular = new PizzaType("Regular", BASE_PRICE);
    public static PizzaType closed = new PizzaType("Closed", CLOSED_PRICE);

    private final String pizzaTypeName;
    private final double pizzaTypePrice;

    private PizzaType(String pizzaTypeName, double pizzaTypePrice) {
        this.pizzaTypeName = pizzaTypeName;
        this.pizzaTypePrice = pizzaTypePrice;
    }
    public String getPizzaTypeName() {
        return pizzaTypeName;
    }

    public double getPizzaTypePrice() {
        return pizzaTypePrice;
    }
}
