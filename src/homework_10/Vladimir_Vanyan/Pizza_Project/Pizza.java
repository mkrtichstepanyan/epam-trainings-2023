package homework_10.Vladimir_Vanyan.Pizza_Project;

import homework_10.Vladimir_Vanyan.Exceptions.InvalidIngredientException;

import java.util.Arrays;

// is a
// has a
public class Pizza extends Product {
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


    public Pizza(String name, PizzaType pizzaType) {
        super(name);
        this.pizzaType = pizzaType;
    }

    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients) {
        super(name);
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient)throws InvalidIngredientException {
        if (isExistIngredient(ingredient)) {
            return;
        }

        if (ingredients.length > MAX_ALLOWED_INGREDIENTS - 1) {
           throw new InvalidIngredientException("Pizza ingredient are full"){};
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

    private boolean isExistIngredient(Ingredient ingredient) throws InvalidIngredientException {
        for (Ingredient i : ingredients) {
            if (i.getName().equals(ingredient.getName())) {
               // System.out.println("in Pizza " + name + " " + ingredient.getName() + "ingredient already exist");
                throw new InvalidIngredientException("Ingredient already exist"){};
            }
        }
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pizza pizza)) return false;

        if (!getPizzaType().equals(pizza.getPizzaType())) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getIngredients(), pizza.getIngredients());
    }
}

