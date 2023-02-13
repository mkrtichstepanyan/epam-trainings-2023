package homework_5.Anush_Ananyan.Pizza;

public class Ingredients {
    private String ingredientName;
    private double priceOfIngredient;

    private Ingredients(String ingredientName, double priceOfIngredient) {
        this.ingredientName = ingredientName;
        this.priceOfIngredient = priceOfIngredient;
    }

    public static Ingredients getTomatoPaste() {
        Ingredients ingredient = new Ingredients("Tomato Pasta", 1);
        return ingredient;
    }

    public static Ingredients getCheese() {
        Ingredients ingredient = new Ingredients("Cheese", 1);
        return ingredient;
    }

    public static Ingredients getSalami() {
        Ingredients ingredient = new Ingredients("Salami", 1.5);
        return ingredient;
    }

    public static Ingredients getBacon() {
        Ingredients ingredient = new Ingredients("Bacon", 1.2);
        return ingredient;
    }

    public static Ingredients getGarlic() {
        Ingredients ingredient = new Ingredients("Garlic", 0.3);
        return ingredient;
    }

    public static Ingredients getCorn() {
        Ingredients ingredient = new Ingredients("Corn", 0.7);
        return ingredient;
    }

    public static Ingredients getPepperoni() {
        Ingredients ingredient = new Ingredients("Pepperoni", 0.6);
        return ingredient;
    }

    public static Ingredients getOlives() {
        Ingredients ingredient = new Ingredients("Olives", 0.5);
        return ingredient;
    }
    public static Ingredients getPaper() {
        Ingredients ingredient = new Ingredients("Paper", 0.6);
        return ingredient;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public double getPriceOfIngredient() {
        return priceOfIngredient;
    }
}
