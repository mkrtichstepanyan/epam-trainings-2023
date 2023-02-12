package homework_5.Hovhannes_Abrahamyan.pizzeria;

import java.util.Arrays;

public class Pizza {

    private static final int MAX_ALLOWED_INGREDIENTS_SIZE = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int ingredientsCount;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public int getIngredientsCount() {
        return ingredientsCount;
    }

    public void setIngredientsCount(int ingredientsCount) {
        this.ingredientsCount = ingredientsCount;
    }

    public Pizza(String name) {
        this.name = name;
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = PizzaType.REGULAR;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", pizzaType=" + pizzaType +
                ", ingredients=" + Arrays.toString(ingredients) +
                ", ingredientsCount=" + ingredientsCount +
                '}';
    }

    public Pizza(String name, PizzaType pizzaType) {
        this.name = name;
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        this.quantity = quantity;
        this.name = name;
        this.pizzaType = pizzaType;
        if (ingredients.length > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("Ingredients more then allowed " + MAX_ALLOWED_INGREDIENTS_SIZE);
            this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        } else {
            this.ingredients = ingredients;
        }
    }

    public double calculatePrice() {
        double price = 0;
        price = price + this.pizzaType.getPrice();


        for (Ingredient ingredient : ingredients) {
            price += ingredient.getPrice();
        }

        return price;
    }

    public void addIngredients(Ingredient ingredient) {
        if (ingredientsCount > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("No more ingredients allowed.");
            return;
        }
        ingredients[ingredientsCount++] = ingredient;
    }
}