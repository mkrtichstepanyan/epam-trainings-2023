package homework_7.garik_gharibyan.drink;



public class Drink {

    private final DrinkType type;

    private final int quantity;

    public Drink(DrinkType drinkType, int quantity) {
        this.type = drinkType;
        this.quantity = quantity;
    }

    public DrinkType getType() {
        return type;
    }


    public double getPrice() {
        return type.getPrice();
    }

    public String getName() {
        return type.getName();
    }

    public int getQuantity() {
        return quantity;
    }

}
