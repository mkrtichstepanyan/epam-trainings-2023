package homework_7.Araksya_Ghazaryan;

public class Pizza {
    public static final Pizza ITALIANO = new Pizza("Italiano", PizzaType.REGULAR, new Ingredient[]{Ingredient.TOMATO_PASTE, Ingredient.SALAMI}, 2);
    public static final Pizza MARGARITA = new Pizza("Margarita", PizzaType.CALZONE, new Ingredient[]{Ingredient.CHEESE, Ingredient.BACON}, 1);
    public static final Pizza PEPPERONI = new Pizza("Pepperoni", PizzaType.REGULAR, new Ingredient[]{Ingredient.PEPPERONI, Ingredient.CHEESE}, 1);
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int quantity;
    private int ingredientsCount = 0;

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
        return this.pizzaType.getPrice() + ingredientPrice * quantity;
    }
    public void addIngredient(Ingredient ingredient) {
        if (ingredientsCount >= MAX_ALLOWED_INGREDIENTS) {
            System.out.println(" The pizza is full");
            return;
        }
        for (int i = 0; i < ingredientsCount; i++) {
            Ingredient ingredient1 = ingredients[i];
            if (ingredient.getName().equals(ingredient1.getName())) {
                System.out.println("The pizza already contains this ingredient");
                return;
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