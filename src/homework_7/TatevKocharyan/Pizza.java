package homework_7.TatevKocharyan;

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


    Pizza( String name,PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients =ingredients;
        this.quantity = quantity;
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

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public void addIngredient(Ingredient ingredient) {
        for (int i = 0; i <ingredients.length ; i++) {
            ingredients[i]=ingredient;
        }
        if (ingredients.length==MAX_ALLOWED_INGREDIENTS){
            System.out.println("You can't add more than 7 ingredients");

        }
        // todo implement a method tht will add ingredient into the list. +
    }
}
