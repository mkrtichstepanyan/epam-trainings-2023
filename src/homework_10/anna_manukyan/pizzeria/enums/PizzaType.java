package homework_10.anna_manukyan.pizzeria.enums;

public enum PizzaType {

    REGULAR("Regular", 0.0),
    CALZONE("Calzone", 0.5);

    private static final double BASE_PRICE = 1.0;
    private double price;
    private String name;

    private double additionalPrice;

    PizzaType(String name, double basePrice) {
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
