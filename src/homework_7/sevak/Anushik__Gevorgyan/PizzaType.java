package homework_7.sevak.Anushik__Gevorgyan;

public class PizzaType {
    private static final double BASE_PRICE = 1.0;

    public static final PizzaType REGULAR =
            new PizzaType("Regular", BASE_PRICE, 0);
    public static final PizzaType CALZONE =
            new PizzaType("Calzone", BASE_PRICE, 0.5);

    public String getName() {
        return name;
    }

    private String name;
    private double price;



    PizzaType(String name, double basePrice, double additionalPrice) {
        this.name = name;
        this.price = basePrice + additionalPrice;
    }

    public double getPrice() {

        return price;
    }
}
