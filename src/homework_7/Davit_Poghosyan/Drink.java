package homework_7.Davit_Poghosyan;

public class Drink extends FoodMenu {
    DrinkType drink;

    public Drink(DrinkType drink, int quantity){
        super(quantity);
        this.drink = drink;
    }
    public DrinkType getDrink(){
        return drink;
    }

}
