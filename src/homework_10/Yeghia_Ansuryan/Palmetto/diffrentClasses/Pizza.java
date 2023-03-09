package homework_10.Yeghia_Ansuryan.Palmetto.diffrentClasses;

import homework_10.Yeghia_Ansuryan.Palmetto.myAbstract.Product;
import homework_10.Yeghia_Ansuryan.Palmetto.myEnum.IngredientPizza;
import homework_10.Yeghia_Ansuryan.Palmetto.myEnum.PizzaType;
import homework_10.Yeghia_Ansuryan.Palmetto.myInterface.DoubleIngredientExistence;

public class Pizza extends Product implements DoubleIngredientExistence {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private static final int MAX_PIZZA_AMOUNT = 10;

    private IngredientPizza[] ingredients = new IngredientPizza[7];
    private int indexOfIngredients = 0;

    Pizza(String name, PizzaType pizzaType, IngredientPizza[] ingredients, int quantity) {
        super(Order.PRODUCT_PIZZA, pizzaType, name, quantity);
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("You may not order more then 10 Pizzas !");
            return;
        }
        addIngredient(ingredients);
    }

    public void addIngredient(IngredientPizza[] ingredients) {
        indexOfIngredients = ingredients.length - 1;
        if (indexOfIngredients < MAX_ALLOWED_INGREDIENTS) {
            isDuplicate(ingredients);
            this.ingredients = ingredients;
        } else {
            System.out.println("The pizza is already Full !");
        }
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (IngredientPizza ingredient : ingredients) {
            if (ingredient != null) {
                ingredientPrice += ingredient.getPrice();
            }
        }

        return getBasicType().getPrice() + ingredientPrice;
    }

    public IngredientPizza[] getIngredients() {
        return ingredients;

    }

}
