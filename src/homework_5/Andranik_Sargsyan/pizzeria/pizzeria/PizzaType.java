package homework_5.Andranik_Sargsyan.pizzeria.pizzeria;

public class PizzaType {
    private final String type;
    private double price = 1;

    public PizzaType(String type, double d) {
        this.price = price + d;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public static PizzaType getRegularType() {
        return new PizzaType("Margarita", 0);
    }

    public static PizzaType getCalzoneType() {

        return new PizzaType("Calzone", 0.5);

    }

    @Override
    public String toString() {
        return "Pizza Base  "  + type  + price + " $";
    }
}