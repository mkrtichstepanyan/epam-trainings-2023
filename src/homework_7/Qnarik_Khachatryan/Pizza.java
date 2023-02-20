package homework_7.Qnarik_Khachatryan;

import java.util.Arrays;

// is a
// has a
public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int quantity;
    private int ingredientIndex = 0;

    Pizza(String name, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS];
    }

    Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    @Override
    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            if (ingredient != null) {
                ingredientPrice += ingredient.getPrice();
            }
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public void addIngredient(Ingredient ingredient) {
        if (Arrays.stream(ingredients).anyMatch(item -> item == ingredient)) {
            System.out.println("Duplicate ingredient");
            return;
        }
        if (ingredientIndex == MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Max ingredients");
            return;
        }
        ingredients[ingredientIndex] = ingredient;
        ingredientIndex++;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
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

