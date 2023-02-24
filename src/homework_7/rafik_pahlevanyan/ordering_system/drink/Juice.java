package homework_7.rafik_pahlevanyan.ordering_system.drink;

import homework_7.rafik_pahlevanyan.ordering_system.product.Product;

public class Juice extends Product {

    public static final Juice COCA_COLA = new Juice("CocaCola", 0.7);
    public static final Juice FANTA = new Juice("Fanta", 0.7);


    private Juice(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double calculatePrice() {
        return this.getPrice() * quantity;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

}
