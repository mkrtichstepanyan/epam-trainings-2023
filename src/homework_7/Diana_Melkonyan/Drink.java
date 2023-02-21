package homework_7.Diana_Melkonyan;

public class Drink extends Item {

    private DrinkType drinkType;

    public Drink(String name,DrinkType drinkType, int quantity){
        super.name=name;
        this.drinkType=drinkType;
        super.quantity = quantity;
    }

    @Override
    public double calculatePrice() {
        return drinkType.getPrice() * getQuantity();
    }

}
