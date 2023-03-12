package homework_7.Sofya_Ghazaryan.Pizza.model;

public class Drink extends Product {


    public static final Drink COCA_COLA = new Drink("CocaCola", 0.5);
    public static final Drink ORANGE_JUICE = new Drink(" ORANGE_JUICE", 1);
    public static final Drink APPLE_JUICE = new Drink("APPLE_JUICE", 1);

    private double price;

    private Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public double calculatePrice() {
        return getPrice() * quantity;
    }

}
