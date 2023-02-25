package homework_7.Araksya_Ghazaryan.pizza;

import homework_7.Araksya_Ghazaryan.product.ProductType;

public class PizzaType extends ProductType {
    private static final double BASE_PRICE = 1.0;

    public static final PizzaType REGULAR = new PizzaType("regular", BASE_PRICE, 0);
    public static final PizzaType CALZONE = new PizzaType("calzone", BASE_PRICE, 0.5);

    PizzaType(String name, double basePrice, double additionalPrice) {
        super(name, basePrice + additionalPrice);
    }
}