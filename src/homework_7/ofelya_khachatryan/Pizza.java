package homework_7.ofelya_khachatryan;

// is a
// has a
public class Pizza extends Product {
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

    @Override
    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public void addIngredient(Ingredient[] requestIngredients, Pizza pizza) {
        // todo implement a method tht will add ingredient into the list.
        Ingredient[] finalIngredients = new Ingredient[4 + requestIngredients.length];
        Ingredient[] defaultIngredients = new Ingredient[finalIngredients.length];

        for (int i = 0; i < defaultIngredients.length; i++) {
            finalIngredients[i] = defaultIngredients[i];
        }
        pizza.setIngredients(finalIngredients);
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return 0;
    }
}

