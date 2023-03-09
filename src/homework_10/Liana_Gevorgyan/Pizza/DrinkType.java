package homework_10.Liana_Gevorgyan.Pizza;

public class DrinkType extends ProductType {

    public static final DrinkType BRANDY =
            new DrinkType("Brandy",  5);

    public static final DrinkType APEROL =
            new DrinkType("Aperol",6);

    public static final DrinkType VINE =
            new DrinkType("Vine",3);
    public static final DrinkType BEER =
            new DrinkType("Beer",2);


    DrinkType(String name, double basePrice) {
        this.name = name;
        this.price = basePrice;
    }
}
