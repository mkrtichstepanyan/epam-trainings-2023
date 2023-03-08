package homework_7.Argishti_Mesropyan;

public class Pizza {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
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

    public void addIngredients(Ingredient ingredient) {
        //todo implement a method tht will add ingredient into the list.
        if (quantity > MAX_ALLOWED_INGREDIENTS) {
            System.out.println("No more ingredients");
            return;
        } else {
            ingredients[quantity++] = ingredient;
        }
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
