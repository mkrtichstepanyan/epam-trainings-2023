package homework_7.Varsik_Pijoyan;

public class Drink extends Product{
    private String name;
    private DrinkType drinkType;
    private Drink[] drinks;
    private int quantity;

    Drink(String name, DrinkType drinkType, int quantity){
        this.name = name;
        this.drinkType = drinkType;
        this.quantity = quantity;
    }



    public double calculatePrice() {
        double drinkPrice = drinkType.getPrice();
        return drinkPrice;
    }
}
