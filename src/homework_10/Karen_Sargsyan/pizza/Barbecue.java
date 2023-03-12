package homework_10.Karen_Sargsyan.pizza;

import homework_10.Karen_Sargsyan.pizza.barbecueEnum.BarbecueMeatType;
import homework_10.Karen_Sargsyan.pizza.barbecueEnum.IngredientBarbecue;
import homework_10.Karen_Sargsyan.pizza.productInterface.DoubleIngredientExistence;

public class Barbecue extends Item implements DoubleIngredientExistence {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private BarbecueMeatType barbecueMeatType;
    private IngredientBarbecue[] ingredients = new IngredientBarbecue[7];
    private int index = 0;

    Barbecue(BarbecueMeatType barbecueMeatType, IngredientBarbecue[] ingredients, int quantity) {
        super(Order.PRODUCT_BURGER, barbecueMeatType, quantity);
        this.barbecueMeatType = barbecueMeatType;
        addIngredient(ingredients);
    }

    public void addIngredient(IngredientBarbecue[] ingredients) {
        index = ingredients.length - 1;
        if (index < MAX_ALLOWED_INGREDIENTS) {
            isDuplicate(ingredients);
            this.ingredients = ingredients;
        } else {
            System.out.println("The burger is already full !");
        }
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (IngredientBarbecue ingredient : ingredients) {
            if (ingredient != null) {
                ingredientPrice += ingredient.getPrice();
            }
        }
        return this.barbecueMeatType.getPrice() + ingredientPrice;
    }

    public IngredientBarbecue[] getIngredients() {
        return ingredients;
    }

    public BarbecueMeatType getBarbecueMeatType() {
        return barbecueMeatType;
    }

}
