package homework_5.Roza_Petrosyan.pizza;

import java.util.*;

public class Pizza {
    private String pizzaName;
    private final PizzaType pizzaType;
    private final int quantity;
    private Ingredient[] ingredients = new Ingredient[7];

    public Pizza(String pizzaName, PizzaType pizzaType, int quantity) {
        this.pizzaName = pizzaName;
        this.quantity = quantity;
        this.pizzaType = pizzaType;
    }

    public boolean isDuplicate(Ingredient[] ingredients) {
        boolean result = false;
        for (int i = 0; i < ingredients.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ingredients.length; j++) {
                if (ingredients[i].equals(ingredients[j])) {
                    result = true;
                    count++;
                }
            }
            if(count == 1) {
                this.ingredients[i] = ingredients[i];
            }
        }
        return result;
    }

    public void addIngredient(Ingredient[] ingredients) {
        if (ingredients.length > 7) {
            System.out.println(pizzaName + " pizza is full");
        }

        if (isDuplicate(ingredients)) {
            System.out.println("Please check your order again!");
        } else {
            this.ingredients = ingredients;
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

