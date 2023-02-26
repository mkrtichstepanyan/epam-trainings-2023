package homework_7.Ani_Kovalenko.Pizza_Abstract;

public class IngredientPizza extends Ingredient {
    public static final IngredientPizza TOMATO_PASTE = new IngredientPizza("Tomato paste", 1);
    public static final IngredientPizza CHEESE = new IngredientPizza("Cheese", 1);
    public static final IngredientPizza SALAMI = new IngredientPizza("Salami", 1.5);
    public static final IngredientPizza BACON = new IngredientPizza("Bacon", 1.2);
    public static final IngredientPizza GARLIC = new IngredientPizza("Garlic", 0.3);
    public static final IngredientPizza CORN = new IngredientPizza("Corn", 0.7);
    public static final IngredientPizza PEPPERONI = new IngredientPizza("Pepperoni", 0.6);
    public static final IngredientPizza OLIVES = new IngredientPizza("Olives", 0.5);

    public IngredientPizza(String name, double price) {
        super(name, price);
    }
}
