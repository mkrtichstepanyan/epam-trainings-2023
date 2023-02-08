package homework_5.Roza_Petrosyan.pizza;

import java.util.*;

public class Pizza {
    private String pizzaName;
    private final PizzaType pizzaType;
    private final int quantity;
    private Ingredient[] ingredients = new Ingredient[1];

    public Pizza(String pizzaName, PizzaType pizzaType, int quantity) {
        this.pizzaName = pizzaName;
        this.quantity = quantity;
        this.pizzaType = pizzaType;
    }

    public boolean isDuplicate(Ingredient[] ingredients) {
        boolean result = false;
        for (int i = 0; i < ingredients.length; i++) {
            for (int j = i + 1; j < ingredients.length; j++) {
                result = ingredients[i].equals(ingredients[j]);
            }
        }
        return result;
    }

    public void addIngredient(Ingredient[] ingredients) {
        if (ingredients.length > 7) {
            System.out.println(pizzaName + " pizza is full");
        }

        this.ingredients = ingredients;

        if (isDuplicate(ingredients)) {
            System.out.println("Please check your order again!");
        }
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
}

