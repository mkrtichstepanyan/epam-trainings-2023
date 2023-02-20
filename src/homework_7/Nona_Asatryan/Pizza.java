package homework_7.Nona_Asatryan;

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
            boolean ingredientExists = false;
            for (Ingredient i : ingredients) {
                if (i != null && i.equals(ingredient)) {
                    ingredientExists = true;
                    break;
                }
            }
            if (ingredientExists) {
                System.out.println("The ingredient already exists, please check the order again.");
            } else {
                for (int i = 0; i < ingredients.length; i++) {
                    if (ingredients[i] == null) {
                        ingredients[i] = ingredient;
                        System.out.println("Added " + ingredient.getName() + " to the pizza.");
                        break;
                    }
                }
            }
        }
    }

    public static void printIngredients(Pizza pizza) {
        Ingredient[] pizzaIngredients = pizza.getIngredients();
        for (Ingredient ingredient : pizzaIngredients) {
            System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " €");
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }
}

