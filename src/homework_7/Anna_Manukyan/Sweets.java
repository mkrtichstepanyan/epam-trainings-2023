package homework_7.Anna_Manukyan;

public class Sweets extends Food {

    static final double PRICE = 5;


    public Sweets(String name, int quantity, FoodType foodType) {
        super(name, quantity, foodType);
    }

    public Sweets(String name, int quantity, String foodType) {
        super(name, quantity, foodType);
    }

    @Override
    public double calculatePrice() {
        return PRICE;
    }
}
