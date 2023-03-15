package homework_10.Anush_Ananyan.Pizza.Pizzeria;

public class SaladType extends ProductType {


    public static final SaladType VEGETABLE =
            new SaladType("vegetable", 5);
    public static final SaladType FRUIT =
            new SaladType("fruit", 7);

    public SaladType(String name, double price) {
        super(name, price);
    }
}
