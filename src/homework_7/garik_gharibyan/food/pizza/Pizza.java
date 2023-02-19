package homework_7.garik_gharibyan.food.pizza;

import homework_7.garik_gharibyan.food.Food;

// is a
// has a
public class Pizza extends Food {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private final PizzaType pizzaType;
    private Ingredient[] ingredients = new Ingredient[0];
    private int topElementIngredients = -1;

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }


    public Pizza(String name, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    public void addIngredient(Ingredient ingredient) {
        if (isExistIngredient(ingredient)) {
            return;
        }

        if (ingredients.length > 6) {
            System.out.println(name + " pizza ingredient are full");
        } else {
            extendCapacityIngredient();
            ingredients[++topElementIngredients] = ingredient;
        }
    }

    private void extendCapacityIngredient() {
        Ingredient[] newArrayIngredients = new Ingredient[ingredients.length + 1];
        for (int i = 0; i < ingredients.length; i++) {
            newArrayIngredients[i] = ingredients[i];
        }
        ingredients = newArrayIngredients;
    }

    private boolean isExistIngredient(Ingredient ingredient) {
        for (Ingredient i : ingredients) {
            if (i.getName().equals(ingredient.getName())) {
                System.out.println("in Pizza " + name + " " + ingredient.getName() + "ingredient already exist");
                return true;
            }
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }
}

