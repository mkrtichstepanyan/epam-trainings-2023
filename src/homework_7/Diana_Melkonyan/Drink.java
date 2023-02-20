package homework_7.Diana_Melkonyan;

public class Drink extends Item {
    private String name;
    private int quantity;
    private DrinkType drinkType;

    public Drink(String name,DrinkType drinkType, int quantity){
        this.name=name;
        this.drinkType=drinkType;
        this.quantity = quantity;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
    @Override
    public double calculatePrice() {
        return drinkType.getPrice();
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }
}
