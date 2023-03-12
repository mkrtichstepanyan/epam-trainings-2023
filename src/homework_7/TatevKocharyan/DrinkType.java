package homework_7.TatevKocharyan;

public class DrinkType extends ProductType {

    private static final double BASE_PRICE = 1.0;
    double additionalPrice;
    public static final DrinkType ORANGEJUICE = new DrinkType("orange juice",  BASE_PRICE,2.0);
    public static final DrinkType TOMATOJUICE = new DrinkType("tomato juice",  BASE_PRICE,1.0);
    public static final DrinkType SOFTDRINKCOLA = new DrinkType("coca cola",  BASE_PRICE,1.5);


    DrinkType(String name, double price,double additionalPrice) {
        super(name,price);
        this.additionalPrice=additionalPrice;

    }

}
