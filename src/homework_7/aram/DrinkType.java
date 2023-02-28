package homework_7.aram;

public class DrinkType {
    public static final DrinkType RED_WINE = new DrinkType("Cagor", 2.5);
    public static final DrinkType FANTA = new DrinkType("Fanta", 1.5);


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
