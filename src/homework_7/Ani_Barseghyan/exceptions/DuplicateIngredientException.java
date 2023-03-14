package homework_7.Ani_Barseghyan.exceptions;

import homework_7.Ani_Barseghyan.Ingredients;

public class DuplicateIngredientException extends Exception {
    public DuplicateIngredientException(Ingredients ingredient) {
        super("Ingredient " + ingredient.getName() + " already exists in Pizza");
    }
}
