package homework_7.Ani_Barseghyan;

import homework_7.Ani_Barseghyan.exceptions.DuplicateIngredientException;

public interface Ingredient {
    void addIngredient(Ingredients ingredients) throws DuplicateIngredientException;
}
