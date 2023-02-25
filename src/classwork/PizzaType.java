package classwork;

public class PizzaType extends ProductType{
    private static final double BASE_PRICE = 1.0;

    public static final PizzaType REGULAR =
            new PizzaType("regular", BASE_PRICE, 0);
    public static final PizzaType CALZONE =
            new PizzaType("calzone", BASE_PRICE, 0.5);



    private double additionalPrice;

    PizzaType(String name, double basePrice, double additionalPrice) {
        super(name, basePrice + additionalPrice);
    }

}
