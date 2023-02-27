package homework_7.Nelli_Poghosyan;

public class Drink extends Product {
    DrinkType drinkType;

    public Drink(DrinkType drinkType, int quantity) {
        super(quantity);
        this.drinkType = drinkType;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public double calculatePrice() {
        return getDrinkType().getPrice();
    }
}
