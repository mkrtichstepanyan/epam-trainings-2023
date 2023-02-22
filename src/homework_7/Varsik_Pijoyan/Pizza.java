package homework_7.Varsik_Pijoyan;

// is a
// has a
public class Pizza extends Product{
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    public static final Pizza MARGARITA = new Pizza("Margarita",
            PizzaType.CALZONE, new Ingredient[]{Ingredient.TOMATO_PASTE, Ingredient.BACON}, 1);
    public static final Pizza PEPPERONI = new Pizza("Pepperoni",
            PizzaType.REGULAR, new Ingredient[]{Ingredient.OLIVES, Ingredient.CHEESE}, 1);

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private final int quantity;
    private int ingCount = 0;


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
        for ( Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public void addIngredient( Ingredient ingredient) {
        // todo implement a method tht will add ingredient into the list.
        if (ingCount  == MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Pizza is full");
            return;
        }
        for (int i = 0; i < ingCount; i++) {
            if (ingredient.getName().equals(ingredient.getName())) {
                System.out.println("This ingredient is already exist!");
                return;
            }
            ingredients[ingCount++] = ingredient;
        }
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Ingredient[] getIngredients(){
        return ingredients;
    }

    public PizzaType getPizzaType(){
        return pizzaType;
    }
}

