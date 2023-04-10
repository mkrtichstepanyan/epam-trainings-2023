package homework_7.ofelya_khachatryan;

public class Drinks extends Product {
    private String name;
    private int quantity;
    private DrinkType drinkType;

    Drinks(String name, DrinkType drinkType, int quantity) {
        this.name = name;
        this.drinkType = drinkType;
        this.quantity = quantity;
    }

    @Override
    double calculatePrice() {
        double drinksPrice = drinkType.getPrice();
        return drinksPrice;
    }
}
