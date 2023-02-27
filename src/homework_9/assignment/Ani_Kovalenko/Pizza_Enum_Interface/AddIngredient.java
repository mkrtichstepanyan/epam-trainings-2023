package homework_9.assignment.Ani_Kovalenko.Pizza_Enum_Interface;

public interface AddIngredient {

    default void isDublicate(BasicIngredient[] ingredients) {
        int indexOfIngredients = ingredients.length - 1;
        for (int i = 0; i <= indexOfIngredients; i++) {
            if (ingredients[indexOfIngredients] != null) {
                String tempIngr = ingredients[i].getName();
                for (int j = 0; j <= indexOfIngredients; j++) {
                    if (ingredients[j].getName().equals(tempIngr) && j != i) {
                        System.out.println(tempIngr + " already exists in your list !!");
                        return;
                    }
                }
            }
        }
    }
}
