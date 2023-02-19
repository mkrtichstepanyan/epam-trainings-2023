package homework_7.garik_gharibyan.drink;

public class DrinkNonAlcoholic {

    private final String name;
    private final double price;

    protected DrinkNonAlcoholic(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }

    public static DrinkNonAlcoholic COCA_COLA = new DrinkNonAlcoholic("Coca-cola", 2);
    public static DrinkNonAlcoholic FANTA = new DrinkNonAlcoholic("Fanta", 2.5);
    public static DrinkNonAlcoholic PEPSI = new DrinkNonAlcoholic("Pepsi", 3);
}
