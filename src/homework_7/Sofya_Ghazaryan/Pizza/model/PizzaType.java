package homework_7.Sofya_Ghazaryan.Pizza.model;

public class PizzaType extends ProductType {

    private static final double BASE_PRICE = 1.0;

    public static final ProductType REGULAR =
            new ProductType("Regular", BASE_PRICE + 0);
    public static final ProductType CALZONE =
            new ProductType("Calzone", BASE_PRICE + 0.5);

    public PizzaType() {
    }

    public PizzaType(String name, double price) {
        super(name, price);
    }
}
