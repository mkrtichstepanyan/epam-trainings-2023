package homework_7.Hovhannes_Gspeyan.palmetto.menu;

public class Drink extends MenuItem {
    private static DrinkType drinkType;

    public Drink(DrinkType drinkType, int quantity) {
        Drink.drinkType = drinkType;
        this.quantity = quantity;
        this.name = drinkType.getName();
    }

    public static DrinkType getDrinkType() {
        return drinkType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculatePrice() {
        return drinkType.getPrice() * quantity;
    }

    public int getQuantity() {
        return quantity;
    }

}
