package homework_8.homework_8_liana_gevorgyan.Pizza;

public class PizzaType extends ProductType {
    private static final double BASE_PRICE = 1.0;

    public static final PizzaType REGULAR =
            new PizzaType("Regular", BASE_PRICE, 0);
    public static final PizzaType CALZONE =
            new PizzaType("Calzone", BASE_PRICE, 0.5);

    PizzaType(String name, double basePrice, double additionalPrice) {
        this.name = name;
        this.price = basePrice + additionalPrice;
    }


}
