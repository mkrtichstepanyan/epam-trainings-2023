package homework_7.Nona_Asatryan;

public class DrinkType {
    public static final DrinkType COCA_COLA = new DrinkType("Coca Cola", 0.5);
    public static final DrinkType BEER = new DrinkType("Beer", 1.5);
    public static final DrinkType JUICE = new DrinkType("Juice", 2.5);

    private String name;
    private double price;

    public DrinkType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
