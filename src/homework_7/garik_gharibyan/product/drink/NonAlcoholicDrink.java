package homework_7.garik_gharibyan.product.drink;

public class NonAlcoholicDrink extends Drink {
    private final boolean isFizzy;

    protected NonAlcoholicDrink(String name, double price, boolean isFizzy) {
        super(name, price);
        this.isFizzy = isFizzy;
    }
    @Override
    public double getPrice() {
        return price;
    }

    public boolean isFizzy() {
        return isFizzy;
    }

    public static NonAlcoholicDrink COCA_COLA = new NonAlcoholicDrink("Coca-cola", 2, true);
    public static NonAlcoholicDrink FANTA = new NonAlcoholicDrink("Fanta", 2.5, true);
    public static NonAlcoholicDrink PEPSI = new NonAlcoholicDrink("Pepsi", 3, true);
    public static NonAlcoholicDrink APPLE = new NonAlcoholicDrink("Apple", 5, false);
    public static NonAlcoholicDrink ORANGE = new NonAlcoholicDrink("Orange", 5, false);
}
