package homework_7.Arsen_Kazaryan;

import homework_7.Eduard_Eghiazaryan.Pizza.Ingredient;
import homework_7.Eduard_Eghiazaryan.Pizza.PizzaType;

public class Pizza {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    private String name;
    private PizzaType pizzaType;
    private homework_7.Eduard_Eghiazaryan.Pizza.Ingredient[] ingredients;
    private int quantity;

    Pizza(String name, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    Pizza(String name, PizzaType pizzaType, homework_7.Eduard_Eghiazaryan.Pizza.Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    public Pizza(String validPizzaName, homework_7.Arsen_Kazaryan.PizzaType type, homework_7.Arsen_Kazaryan.Ingredient[] ingredients, int quantity) {


    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (homework_7.Eduard_Eghiazaryan.Pizza.Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return (this.pizzaType.getPrice() + ingredientPrice) * getQuantity();
    }

    public void addIngredient(homework_7.Eduard_Eghiazaryan.Pizza.Ingredient ingredient) {
        // todo implement a method tht will add ingredient into the list.
        if (quantity > MAX_ALLOWED_INGREDIENTS) {
            System.out.println("No more ingredients allowed.");
            return;
        }
        ingredients[quantity++] = ingredient;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
}
