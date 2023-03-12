package homework_7.Anush_Ananyan;

public class SaladType extends ProductType {


    public static final SaladType VEGETABLE =
            new SaladType("vegetable", 5);
    public static final SaladType FRUIT =
            new SaladType("fruit", 7);

    public SaladType(String name, double price) {
        super(name, price);
    }
}
