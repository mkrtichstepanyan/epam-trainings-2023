package homework_5.Alina_Mkhoyan.pizzeria;

public class Pizza {

    private static final int MAX_ALLOWED_INGREDIENTS_SIZE = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int ingredientsCount;

    public Pizza(String name) {
        this.name = name;
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = PizzaType.REGULAR;
    }

    public Pizza(String name, PizzaType pizzaType) {
        this.name = name;
        this.ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = pizzaType;
    }


    public static Pizza addPizza(String name, PizzaType pizzaType, Ingredient... ingredients) {
        return new Pizza(name, pizzaType, ingredients);
    }

    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients) {
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
        price = price + pizzaType.getPrice();

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

    public String getName() {
        return name;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public int getIngredientsCount() {
        return ingredientsCount;
    }
}
