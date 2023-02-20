package homework_7_Hovhannes_Gspeyan.palmetto.menu;

public class Drink extends MenuItem {
    private DrinkType drinkType;

    public Drink(DrinkType drinkType, int quantity) {
        this.drinkType = drinkType;
        this.quantity = quantity;
        this.name = drinkType.getName();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double calculatePrice() {
        return this.drinkType.getPrice();
    }

    public int getQuantity() {
        return quantity;
    }

}
