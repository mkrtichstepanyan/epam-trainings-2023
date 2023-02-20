package homework_5.Karen_Sargsyan.Pizza;

public class PizzaType {
    private final String name;
    private final double price;

    private PizzaType(String name, double price) {
        this.name = name;
        this.price = price;

    }

    public static PizzaType getTypeOfPizzaRegular() {
        return new PizzaType("Regular", 1.0);
    }

    public static PizzaType getTypeOfPizzaClosed() {
        return new PizzaType("Closed", 1.5);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

}
