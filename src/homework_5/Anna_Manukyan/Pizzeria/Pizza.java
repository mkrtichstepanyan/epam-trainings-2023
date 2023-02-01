package homework_5.Anna_Manukyan.Pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private PizzaType pizzaType;
    private String name;
    private List<Ingredient> ingredients;
    private int quantity;
    private static final double BASE_COST = 1;

    public Pizza(PizzaType pizzaType, String name, List<Ingredient> ingredients, int quantity) {
        this.pizzaType = pizzaType;
        this.name = name;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredients.size() == 7) {
            System.out.println("Pizza is full");
        } else {
            for (Ingredient ingred : ingredients) {
                if (ingredient.equals(ingred)) {
                    System.out.println("This ingredient is already exist!");
                } else {
                    ingredients.add(ingredient);
                }
            }
        }
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getBASE_COST() {
        return BASE_COST;
    }
}
