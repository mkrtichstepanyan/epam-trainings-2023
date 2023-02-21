package homework_7.garik_gharibyan.product.drink;

public class NonAlcoholicDrink extends Drink {
    protected NonAlcoholicDrink(String name, double price) {
        super(name, price);
    }
    @Override
    public double getPrice() {
        return price;
    }

    public static final NonAlcoholicDrink COCA_COLA = new NonAlcoholicDrink("Coca-cola", 2);
    public static final NonAlcoholicDrink PEPSI = new NonAlcoholicDrink("Pepsi", 3);
    public static final NonAlcoholicDrink APPLE = new NonAlcoholicDrink("Apple", 5);
    public static final NonAlcoholicDrink ORANGE = new NonAlcoholicDrink("Orange", 5);
}
