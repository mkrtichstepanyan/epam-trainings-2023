package homework_7.Ani_Barseghyan;

public class PizzaType extends ProductType {
    private String type = "pizza";
    private static final double BASE_PRICE = 1.0;
    public static final PizzaType REGULAR = new PizzaType("Pizza Regular", BASE_PRICE, 0);
    public static final PizzaType CALZONE = new PizzaType("Pizza Calzone", BASE_PRICE, 0.5);


    PizzaType(String name, double basePrice, double additionalPrice) {
        super(name, basePrice + additionalPrice);
    }

    public String getType() {
        return type;
    }
}
