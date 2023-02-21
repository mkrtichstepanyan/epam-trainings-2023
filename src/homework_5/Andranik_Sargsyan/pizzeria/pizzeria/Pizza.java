package homework_5.Andranik_Sargsyan.pizzeria.pizzeria;

public class Pizza {
    private static final int MAX_INGREDIENTS_SIZE = 7;
    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int ingredientsCount;


    public Pizza(String name) {
        this.name = name;
        this.ingredients = new Ingredient[MAX_INGREDIENTS_SIZE];
        this.pizzaType = PizzaType.getRegularType();
    }

    public Pizza(String name, PizzaType pizzaType) {
        this.name = name;
        this.ingredients = new Ingredient[MAX_INGREDIENTS_SIZE];
        this.pizzaType = pizzaType;
    }

    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients) {
        this.name = name;
        this.pizzaType = pizzaType;
        if (ingredients.length > MAX_INGREDIENTS_SIZE) {
            System.out.println("Ingredients more then allowed " + MAX_INGREDIENTS_SIZE);
            this.ingredients = new Ingredient[MAX_INGREDIENTS_SIZE];
        } else {
            this.ingredients = ingredients;
        }
    }

    public static Pizza addPizza(String name, PizzaType pizzaType, Ingredient... ingredients) {
        return new Pizza(name, pizzaType, ingredients);
    }


    public double calculatePrice() {
        double price = 0.0d;
        price = price + pizzaType.getPrice();
        for (Ingredient ingredient : ingredients) {
            price += ingredient.getPrice();
        }
        return price;
    }

    public void addIngredients(Ingredient ingredient) {
        if (ingredientsCount > MAX_INGREDIENTS_SIZE) {
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