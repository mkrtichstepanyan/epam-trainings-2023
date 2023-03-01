package homework_7.robert_nazaryan;

public class Drink extends Product {
    public static final Drink COCA_COLA = new Drink("Coca Cola", 1);
    public static final Drink FANTA = new Drink("Fanta", 1);
    public static final Drink SPRITE = new Drink("Sprite", 1);

    public Drink(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }
}

