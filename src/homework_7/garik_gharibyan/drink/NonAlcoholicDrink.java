package homework_7.garik_gharibyan.drink;

public class NonAlcoholicDrink extends Drink {
    private final boolean isFizzy;

    protected NonAlcoholicDrink(String name, double price ,boolean isFizzy) {
        this.isFizzy= isFizzy;
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
    @Override
    public String getName() {
        return name;
    }
    public boolean isFizzy() {
        return isFizzy;
    }
    public static NonAlcoholicDrink COCA_COLA = new NonAlcoholicDrink("Coca-cola", 2,true);
    public static NonAlcoholicDrink FANTA = new NonAlcoholicDrink("Fanta", 2.5,true);
    public static NonAlcoholicDrink PEPSI = new NonAlcoholicDrink("Pepsi", 3,true);
    public static NonAlcoholicDrink APPLE = new NonAlcoholicDrink("Apple", 5,false);
    public static NonAlcoholicDrink ORANGE = new NonAlcoholicDrink("Orange", 5,false);
}
