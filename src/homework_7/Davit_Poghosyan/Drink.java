package homework_7.Davit_Poghosyan;

public class Drink extends Product {
    DrinkType drink;

    public Drink(DrinkType drink, int quantity){
        super(quantity);
        this.drink = drink;
    }
    public DrinkType getDrink(){
        return drink;
    }

}
