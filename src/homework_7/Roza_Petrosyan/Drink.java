package homework_7.Roza_Petrosyan;

public class Drink extends OrderItem {
    public Drink(String name, DrinkType drinkType, int quantity) {
        super(name,drinkType, quantity);
    }

    @Override
    public double calculatePrice() {
        return drinkType.getPrice();
    }
}
