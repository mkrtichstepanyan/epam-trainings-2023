package homework_7.Anna_Manukyan;

import static homework_7.Anna_Manukyan.Food.BASE_COST;

public class FoodType {
    public static final FoodType PIZZA =
            new FoodType("pizza", BASE_COST);

    public static final FoodType SWEETS =
            new FoodType("sweets", 0);
    private String name;
    private double price;

    FoodType(String name, double basePrice) {
        this.name = name;
        this.price = basePrice;
    }

    public String getName() {
        return name;
    }
}
