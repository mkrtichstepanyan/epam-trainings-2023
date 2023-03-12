package homework_10.Ani_Kovalenko.Pizza_Exceptions;

import homework_10.Ani_Kovalenko.Pizza_Exceptions.MyExceptions.DoubleIngredientException;

public interface CheckDuplication {

    default void isDuplicate(Basic[] ingredients) throws DoubleIngredientException {
        int indexOfIngredients = ingredients.length - 1;
        for (int i = 0; i <= indexOfIngredients; i++) {
            if (ingredients[indexOfIngredients] != null) {
                String tempIngr = ingredients[i].getName();
                for (int j = 0; j <= indexOfIngredients; j++) {
                    if (ingredients[j].getName().equals(tempIngr) && j != i) {
                        throw new DoubleIngredientException(tempIngr + " already exists in your list !!");
                    }
                }
            }
        }
    }
}
