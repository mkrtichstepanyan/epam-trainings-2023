package homework_7.aram;

public class Drink extends Product {

    private DrinkType drinkType;
    public Drink(String name, DrinkType drinkType, int quantity,ProductType productType) {
        super(name, drinkType.getPrice(), quantity,productType );
        this.drinkType = drinkType;
    }





    public DrinkType getDrinkType() {
        return drinkType;
    }



    @Override
    public double calculatePrice() {
        return this.drinkType.getPrice();
    }
}
