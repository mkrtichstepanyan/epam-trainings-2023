package homework_7.rafik_pahlevanyan.ordering_system.pizza;

import homework_7.rafik_pahlevanyan.ordering_system.product.ProductType;

public class PizzaType extends ProductType {
    private static final double BASE_PRICE = 1.0;

    public static final PizzaType REGULAR =
            new PizzaType("Regular", BASE_PRICE, 0);
    public static final PizzaType CALZONE =
            new PizzaType("Calzone", BASE_PRICE, 0.5);


    PizzaType(String name, double basePrice, double additionalPrice) {
        super(name, basePrice + additionalPrice);
    }

}
