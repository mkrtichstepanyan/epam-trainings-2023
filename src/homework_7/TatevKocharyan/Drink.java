package homework_7.TatevKocharyan;

public class Drink extends Product {

    Drink[] drinks = new Drink[10];

    public Drink(String name, DrinkType drinkType, int quantity) {

        super(name, drinkType, quantity);
    }

    @Override
    public double calculatePrice() {

        double drinkPrice = 0.0;
        for (Drink drink : drinks) {
            drinkPrice = drink.getProductType().getPrice();
        }

        return this.getProductType().getPrice() + drinkPrice;
    }
}
