package homework_5.pizza;

public class PizzaType {

    private final String type;
    private double price;

    public PizzaType(String type, double delta) {
        this.price = price + delta;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public static PizzaType getRegularType() {
        return new PizzaType("Regular", 1);
    }

    public static PizzaType getCalzoneType() {
        return new PizzaType("Calzone", 0.5);
    }

    public String getType() {
        return type;
    }
}
