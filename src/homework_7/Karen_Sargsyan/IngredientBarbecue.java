package homework_7.Karen_Sargsyan;

public class IngredientBarbecue extends Ingredient {
    public static final IngredientBarbecue BREAD = new IngredientBarbecue("Bread", 0.8);
    public static final IngredientBarbecue ONION = new IngredientBarbecue("Onion", 0.7);
    public static final IngredientBarbecue TOMATO_PASTE = new IngredientBarbecue("Tomato Paste", 1);

    public IngredientBarbecue(String name, double price) {
        super(name, price);
    }

}
