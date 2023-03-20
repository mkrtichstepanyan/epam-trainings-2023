package homework_7.Zara_Avetyan;

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
        return (this.pizzaType.getPrice() + ingredientPrice) * quantity;
    }

    public void addIngredient(Ingredient ingredient) {
        //todo implement a method that will add ingredient into the list.
        if (ingredients.length == MAX_ALLOWED_INGREDIENTS) {
            System.out.println("The pizza is already full.");
        } else {
            for (int i = 0; i < ingredients.length; i++) {
                if (ingredient.equals(ingredients[i])) {
                    System.out.println("You already have that ingredient.");
                    return;
                } else {
                    ingredients[i++] = ingredient;
                }
            }
        }
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
