package homework_7.garik_gharibyan.drink;

public class DrinkType {

    public static DrinkType COCA_COLA = new DrinkType("Coca-cola", 2);
    public static DrinkType FANTA = new DrinkType("Fanta", 2.5);
    public static DrinkType PEPSI = new DrinkType("Pepsi", 3);


    private final String name;
    private final double price;

    private DrinkType(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}
