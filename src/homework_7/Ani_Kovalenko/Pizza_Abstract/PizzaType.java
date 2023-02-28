package homework_7.Ani_Kovalenko.Pizza_Abstract;

public class PizzaType extends ItemType {
    private static final double BASE_PRICE = 1.0;

    public static final PizzaType REGULAR =
            new PizzaType("Regular", BASE_PRICE, 0);
    public static final PizzaType CALZONE =
            new PizzaType("Calzone", BASE_PRICE, 0.5);
    private double additionalPrice;

    PizzaType(String name, double basePrice, double additionalPrice) {
        super(name, basePrice + additionalPrice);
    }
}
