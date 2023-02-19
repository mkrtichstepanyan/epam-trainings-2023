package homework_7.Radik_Manasyan;


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

    public void addIngredient(Ingredient ingredient) {

        for (int i = ingredients.length; i < MAX_ALLOWED_INGREDIENTS; i++) {
            for (Ingredient ingredientPizza : ingredients) {
                if (ingredient.getName().equals(ingredientPizza.getName())) {
                    System.out.println(ingredient.getName() + " in ingredients list");
                    break;
                } else {
                    ingredients[i] = ingredient;
                }
            }

            if (ingredients.length == MAX_ALLOWED_INGREDIENTS) {
                System.out.println("All ingredients add in ingredient list");
            }
        }
    }

    public String getName() {
        return name;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }
}

