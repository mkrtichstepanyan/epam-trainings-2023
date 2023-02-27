package homework_9.Ani_Kovalenko.Pizza_Enum_Interface;

public enum IngredientBurger implements BasicIngredient {
    CHICKEN_MEAT("Chicken Meat", 0.5),
    CHEESE("Cheese", 0.3);

    private String name;
    private double price;
    IngredientBurger(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
