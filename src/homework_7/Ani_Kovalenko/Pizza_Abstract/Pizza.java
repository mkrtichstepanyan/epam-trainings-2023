package homework_7.Ani_Kovalenko.Pizza_Abstract;

import homework_7.Ani_Kovalenko.Pizza_Abstract.IngredientPizza;
import homework_7.Ani_Kovalenko.Pizza_Abstract.Item;
import homework_7.Ani_Kovalenko.Pizza_Abstract.Order;
import homework_7.Ani_Kovalenko.Pizza_Abstract.PizzaType;

public class Pizza extends Item {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private static final int MAX_PIZZA_AMOUNT = 10;
    private IngredientPizza[] ingredients = new IngredientPizza[7];
    private int indexOfIngredients = 0;

    Pizza(String name, PizzaType pizzaType, IngredientPizza[] ingredients, int quantity) {
        super(Order.PRODUCT_PIZZA, pizzaType, name, quantity);
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("You may not order more than 10 pizzas!!");
            return;
        }
        addIngredient(ingredients);
    }

    public void addIngredient(IngredientPizza[] ingredients) {
        indexOfIngredients = ingredients.length - 1;
        if (indexOfIngredients < MAX_ALLOWED_INGREDIENTS) {
            for (int i = 0; i <= indexOfIngredients; i++) {
                if (ingredients[indexOfIngredients] != null) {
                    String tempIngr = ingredients[i].getName();
                    for (int j = 0; j <= indexOfIngredients; j++) {
                        if (ingredients[j].getName().equals(tempIngr) && j != i) {
                            System.out.println(tempIngr + " already exists in your pizza !!");
                            return;
                        }
                    }
                }
            }
            this.ingredients = ingredients;
        } else {
            System.out.println("The pizza is already Full !!");
        }
    }
    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (IngredientPizza ingredient : ingredients) {
            if (ingredient != null) {
                ingredientPrice += ingredient.getPrice();
            }
        }
        return getItemType().getPrice() + ingredientPrice;
    }

    public IngredientPizza[] getIngredients() {
        return ingredients;
    }
}
