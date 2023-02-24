package homework_7.Nona_Asatryan;

public interface Ingredients {
    void addIngredient(Ingredient ingredient);

    default void addIngredients(Ingredient[] ingredients) {
        for (Ingredient ingredient : ingredients) {
            addIngredient(ingredient);
        }
    }
}
