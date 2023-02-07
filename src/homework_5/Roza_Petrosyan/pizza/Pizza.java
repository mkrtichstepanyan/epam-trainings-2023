package homework_5.Roza_Petrosyan.pizza;

import java.util.*;

public class Pizza {
    private String pizzaName;
    private String pizzaType;
    private int quantity;
    private String[] ingredients = new String[1];

    public Pizza(String pizzaName, String pizzaType, int quantity) {
        this.pizzaName = pizzaName;
        this.quantity = quantity;
        this.pizzaType = pizzaType;
    }

    public boolean isDuplicate(String[] ingredients) {
        boolean result = false;
        for (int i = 0; i < ingredients.length; i++) {
            for (int j = i + 1; j < ingredients.length; j++) {
                result = ingredients[i].equals(ingredients[j]);
            }
        }
        return result;
    }

    public void addIngredient(String[] ingredients) {
        if (ingredients.length > 7) {
            System.out.println(pizzaName + " pizza is full");
        }

        System.out.println(Arrays.toString(ingredients));
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

    public String getPizzaType() {
        return pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public String[] getIngredients() {
        return ingredients;
    }
}

