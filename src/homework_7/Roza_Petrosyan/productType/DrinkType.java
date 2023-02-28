package homework_7.Roza_Petrosyan.productType;

public class DrinkType extends ProductType{

    public static final DrinkType NATURAL =
            new DrinkType("Natural", 1.5);
    public static final DrinkType FIZZY =
            new DrinkType("Fizzy", 1);
    public static final DrinkType ALCOHOLIC =
            new DrinkType("Alcoholic", 2);


    DrinkType(String name, double basePrice) {
        super(name, basePrice);
    }
}
