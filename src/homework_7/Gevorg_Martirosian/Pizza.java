package homework_7.Gevorg_Martirosian;

// is a
// has a
public class Pizza {
    public static final Pizza MARGARITA = new Pizza("Margarita", PizzaType.CALZONE, new Ingredient[]{Ingredient.TOMATO_PASTE, Ingredient.PEPPERONI, Ingredient.GARLIC, Ingredient.BACON}, 1);
    public static final Pizza PEPPERONI = new Pizza("Pepperoni", PizzaType.REGULAR, new Ingredient[]{Ingredient.TOMATO_PASTE, Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.OLIVES}, 1);

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
        for (Ingredient element : ingredients) {
            if (element.getName() == ingredient.getName()) {
                System.out.println("ingredient " + ingredient.getName() + " is already exist in " + this.getName());
                return;
            }
        }
        int newLength = ingredients.length + 1;
        Ingredient[] newIngredients = new Ingredient[newLength];
        for (int i = 0; i < newIngredients.length - 1; i++) {
            newIngredients[i] = ingredients[i];
        }
        newIngredients[newIngredients.length - 1] = ingredient;
        ingredients = newIngredients;
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

