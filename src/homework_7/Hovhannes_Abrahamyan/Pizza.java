package homework_7.Hovhannes_Abrahamyan;

// is a
// has a
public class Pizza {
    private static final int MAX_ALLOWED_INGREDIENTS = 10;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int quantity;

    Pizza(String name, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public void addIngredient(Ingredient ingredient) {
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
}

