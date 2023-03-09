package homework_10.Karen_Sargsyan.pizza.myInterface;

public interface DoubleIngredientExistence {
    default void isDuplicate(ProductComponent[] ingredients) {
        int indexOfIngredients = ingredients.length - 1;
        for (int i = 0; i <= indexOfIngredients; i++) {
            if (ingredients[indexOfIngredients] != null) {
                String tempIng = ingredients[i].getName();
                for (int j = 0; j <= indexOfIngredients; j++) {
                    if (ingredients[j].getName().equals(tempIng) && j != i) {
                        System.out.println(tempIng + " already exists in your list !");
                        return;
                    }
                }
            }
        }
    }

}
