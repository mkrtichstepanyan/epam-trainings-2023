package homework_7.Araksya_Ghazaryan.drink;

import homework_7.Araksya_Ghazaryan.product.Product;

public class Juice extends Product {
    public static final Juice PEPSI = new Juice("Pepsi", 0.7);
    public static final Juice TEA = new Juice("Tea", 0.7);

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