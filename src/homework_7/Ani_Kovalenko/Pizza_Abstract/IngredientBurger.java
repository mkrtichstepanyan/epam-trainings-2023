package homework_7.Ani_Kovalenko.Pizza_Abstract;

public class IngredientBurger extends Ingredient {
    public static final IngredientBurger CHICKEN_MEAT = new IngredientBurger("Chicken Meat", 0.5);
    public static final IngredientBurger CHEESE = new IngredientBurger("Cheese", 0.3);
    IngredientBurger(String name, double price){
        super(name, price);
    }
}
