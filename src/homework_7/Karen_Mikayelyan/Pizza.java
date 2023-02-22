package homework_7.Karen_Mikayelyan;

// is a
// has a
public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int quantity;

    Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity, ProductType productType) {
        super(name, pizzaType.getPrice(), quantity, productType);
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.productType = productType;
    }

    @Override
    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredients.length >= MAX_ALLOWED_INGREDIENTS) {
            System.out.println("The pizza is already full.");
        } else {
            ingredientExists(ingredient);
        }
    }

    public static void printPizzaIngredients(Pizza pizza) {
        Ingredient[] pizzaIngredients = pizza.getIngredients();
        for (Ingredient ingredient : pizzaIngredients) {
            System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " €");
        }
    }

    private boolean ingredientExists(Ingredient ingredient) {
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredient.equals(ingredients[i])) {
                System.out.println("This ingredient is already exist!");
                return false;
            } else {
                ingredients[i++] = ingredient;
            }
        }
        return true;
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

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }
}

