package homework_10.Ani_Kovalenko.Pizza_Exceptions;

import homework_10.Ani_Kovalenko.Pizza_Exceptions.MyExceptions.DoubleIngredientException;

public class Pizza extends Item implements CheckDuplication {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private static final int MAX_PIZZA_AMOUNT = 10;
    private IngredientPizza[] ingredients = new IngredientPizza[7];
    private int indexOfIngredients = 0;

    Pizza(String name, PizzaType pizzaType, IngredientPizza[] ingredients, int quantity) throws DoubleIngredientException {
        super(Order.PRODUCT_PIZZA, pizzaType, name, quantity);
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("You may not order more than 10 pizzas!!");
            return;
        }
        addIngredient(ingredients);
    }

    public void addIngredient(IngredientPizza[] ingredients) throws DoubleIngredientException {
        indexOfIngredients = ingredients.length - 1;
        if (indexOfIngredients < MAX_ALLOWED_INGREDIENTS) {
            isDuplicate(ingredients);
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
