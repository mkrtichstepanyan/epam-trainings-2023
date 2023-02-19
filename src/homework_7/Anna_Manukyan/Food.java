package homework_7.Anna_Manukyan;

public abstract class Food {
    String name;
    int quantity;
    static double BASE_COST;
    FoodType foodType;

    protected Food() {
    }

    public Food(String name, int quantity, FoodType foodType) {
        this.name = name;
        this.quantity = quantity;
        this.foodType = foodType;
    }

    public Food(String name, int quantity, String foodType) {
        this.name = name;
        this.quantity = quantity;
        String upperCase = foodType.toUpperCase();
        switch (upperCase) {
            case "SWEETS" -> this.foodType = FoodType.SWEETS;
            case "PIZZA" -> this.foodType = FoodType.PIZZA;
        }
    }

    public abstract double calculatePrice();

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public FoodType getFoodType() {
        return foodType;
    }
}
