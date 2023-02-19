package homework_7.Roza_Petrosyan;

public class Drink extends Calculator {
    private String name;
    private int quantity;
    private DrinkType drinkType;

    public Drink(String name, DrinkType drinkType, int quantity) {
        this.name = name;
        this.drinkType = drinkType;
        this.quantity = quantity;
    }

    @Override
    public double calculatePrice() {
        return drinkType.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }
}
