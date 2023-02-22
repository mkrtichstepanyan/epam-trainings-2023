package homework_7.sevak.Anushik__Gevorgyan;


public class Pizza extends Product {
    public static final Pizza MARGARITA = new Pizza("Margarita", PizzaType.CALZONE, new Ingredient[]{
            Ingredient.CHEESE, Ingredient.GARLIC}, 3);
    public static final Pizza PEPPERONI = new Pizza("Pepperoni", PizzaType.REGULAR, new Ingredient[]{
            Ingredient.OLIVES, Ingredient.BACON}, 5);


    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS];
    private int quantity;

    private int ingredientsCount = 0;

    Pizza(String name, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    public Pizza() {

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
            if (ingredient != null) {
                ingredientPrice = ingredientPrice + ingredient.getPrice();
            }

        }
        return (this.pizzaType.getPrice() + ingredientPrice) * quantity;
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredientsCount >= MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Pizza is full");
            return;
        }
        for (int i = 0; i < ingredientsCount; i++) {
            Ingredient ingredient1 = ingredients[i];
            if (ingredient.getName().equals(ingredient1.getName())) {
                System.out.println("Pizza contains ingredients");
                return;
            }

        }
        ingredients[ingredientsCount++] = ingredient;
        // todo implement a method tht will add ingredient into the list.
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

    public Ingredient[] ingredients() {
        return ingredients;
    }
}

