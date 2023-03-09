package homework_10.Yeghia_Ansuryan.Palmetto.myInterface;

import homework_10.Yeghia_Ansuryan.Palmetto.myExceptions.DoubleIngredientException;

public interface DoubleIngredientExistence {
    default void isDuplicate(ProductComponent[] ingredients) throws DoubleIngredientException {
        int indexOfIngredients = ingredients.length - 1;
        for (int i = 0; i <= indexOfIngredients; i++) {
            if (ingredients[indexOfIngredients] != null) {
                String tempIng = ingredients[i].getName();
                for (int j = 0; j <= indexOfIngredients; j++) {
                    if (ingredients[j].getName().equals(tempIng) && j != i) {
                        throw new DoubleIngredientException(tempIng + " already exists in your list !");
                    }
                }
            }
        }
    }
}
