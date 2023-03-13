package homework_7.Hovhannes_Gspeyan.palmetto.menu;

public class Drink implements MenuItem {

    private  String name;

    private int quantity;
    private static DrinkType drinkType;

    public Drink() {
    }

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
        return drinkType.getPrice() * getQuantity();
    }

    public int getQuantity() {
        return quantity;
    }
}
