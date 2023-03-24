package homework_10.Nona_Asatryan.pizzeriaExceptions;

public interface Ingredients {
    void addIngredient(Ingredient ingredient);

    default void addIngredients(Ingredient[] ingredients) {
        for (Ingredient ingredient : ingredients) {
            addIngredient(ingredient);
        }
    }
}
