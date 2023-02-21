package homework_7.garik_gharibyan.product.drink;

public class AlcoholicDrink extends Drink {

    private AlcoholicDrink(String name, double price) {
        super(name, price);
    }

    public static final AlcoholicDrink VODKA = new AlcoholicDrink("Vodka", 7);

    @Override
    public double getPrice() {
        return this.price;
    }
}
