package homework_7.garik_gharibyan.fast_foot.foots.drink;

import homework_7.garik_gharibyan.fast_foot.foots.Food;

public class Drink extends Food {

    private final DrinkType type;

    public Drink(DrinkType drinkType, int quantity) {
        this.type = drinkType;
        this.quantity = quantity;
    }

    public DrinkType getType() {
        return type;
    }

    @Override
    public double getPrice() {
        return type.getPrice();
    }

    @Override
    public String getName() {
        return type.getName();
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

}
