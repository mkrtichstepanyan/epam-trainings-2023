package homework_7.aram;

// is a
// has a
public class Pizza extends Product  {
    private static final int MAX_ALLOWED_INGREDIENTS = 10;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int quantity;




    Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity,ProductType productType) {
        super(name, pizzaType.getPrice(), quantity, productType);
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public void addIngredient(Ingredient ingredient) {
        // todo implement a method tht will add ingredient into the list.
        if (ingredients.length >= MAX_ALLOWED_INGREDIENTS) {
            System.out.println("The pizza is already full");

        }
        for (Ingredient existingIngredient : ingredients) {
            if (existingIngredient.equals(ingredient)) {
                System.out.println("This ingredient is already exists, please remove! ");
                break;
            }
            Ingredient[] newIngredients = new Ingredient[ingredients.length + 1];
            for (int i = 0; i < ingredients.length; i++) {
                newIngredients[i] = ingredients[i];
                newIngredients[ingredients.length] = ingredient;
            }
            ingredients = newIngredients;
        }

    }
    public static void printPizzaIngredients(Pizza pizza) {
        Ingredient[] pizzaIngredients = pizza.getIngredients();
        for (Ingredient ingredient : pizzaIngredients) {
            System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " €");
        }
    }

    public Ingredient[] getIngredients() {
        return ingredients;
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




}

