package homework_10.anna_manukyan.pizzeria.pizza;

import homework_10.anna_manukyan.pizzeria.CustomExceptions.ProductTypeException;
import homework_10.anna_manukyan.pizzeria.annotations.NotNull;
import homework_10.anna_manukyan.pizzeria.enums.ProductType;
import homework_10.anna_manukyan.pizzeria.enums.Ingredient;
import homework_10.anna_manukyan.pizzeria.enums.PizzaType;
import homework_10.anna_manukyan.pizzeria.product.Product;

// is a
// has a
public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    @NotNull
    private PizzaType pizzaType;
    @NotNull
    private Ingredient[] ingredients;

    static {
        BASE_COST = 1;
    }

    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity, ProductType productType) throws ProductTypeException {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        this.quantity = quantity;
        if (productType == null) {
            throw new ProductTypeException();
        } else {
            this.productType = productType;
        }
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice + BASE_COST;
    }

    public double calculateBasePrice() {
        return BASE_COST + pizzaType.getPrice();
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredients.length == MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Pizza is full");
        } else {
            isExistInPizza(ingredient);
        }
    }

    public static void printPizzaIngredients(Pizza pizza) {
        Ingredient[] pizzaIngredients = pizza.getIngredients();
        for (Ingredient ingredient : pizzaIngredients) {
            System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " €");
        }
    }

    private boolean isExistInPizza(Ingredient ingredient) {
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredient.equals(ingredients[i])) {
                System.out.println("This ingredient is already exist!");
                return false;
            } else {
                ingredients[i++] = ingredient;
            }
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }
}

