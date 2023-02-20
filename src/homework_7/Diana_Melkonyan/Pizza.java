package homework_7.Diana_Melkonyan;

// is a
// has a
public class Pizza extends Item {
    public static final Pizza MARGARITA = new Pizza("Margarita", PizzaType.CALZONE, new Ingredient[]{
            Ingredient.CHEESE, Ingredient.CORN}, 3);
    public static final Pizza PEPPERONI = new Pizza("Pepperoni", PizzaType.REGULAR, new Ingredient[]{
            Ingredient.OLIVES, Ingredient.PEPPERONI}, 5);
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int quantity;
    private int ingredientCount = 0;

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
        // todo implement a method tht will add ingredient into the list.
        if(ingredientCount>=MAX_ALLOWED_INGREDIENTS){
            System.out.println("Pizza iz full");
            return;
        }
        for (int i = 0; i < ingredientCount; i++) {
            if (ingredients[i].equals(ingredient)) {
                System.out.println("Check the order");
                return;
            }

        }
        ingredients[ingredientCount++] = ingredient;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
    public PizzaType getPizzaType(){
        return pizzaType;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }
}

