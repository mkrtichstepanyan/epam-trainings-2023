package homework_7.Varsik_Pijoyan;

public class DrinkType {
    private static final double BASE_PRICE = 2.0;
    public static final DrinkType FANTA = new DrinkType ("Fanta", BASE_PRICE, 0.0);
    public static final DrinkType COCA_COLA = new DrinkType("Cola", BASE_PRICE, 0.5);
    public static final DrinkType SPRITE = new DrinkType("Sprite", BASE_PRICE, 1.0);

    private String name;
    private double price;

    DrinkType(String name,  double basePrice, double additionalPrice){
        this.name = name;
        this.price = basePrice + additionalPrice;
    }
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
