package homework_7.sevak.Ani_Barseghyan;

public class Pizza extends OrderItem {
    private static final int MAX_ALLOWED_INGREDIENTS = 8;
    private String name;
    private PizzaType pizzaType;
    private Ingredients[] ingredients = new Ingredients[10];
    private int quantity;
    private static int toppingCount;

    Pizza(String name, PizzaType pizzaType, int quantity) {
        super(name, quantity);
        this.name = name;
        this.quantity = quantity;
        this.pizzaType = pizzaType;
        this.ingredients = new Ingredients[MAX_ALLOWED_INGREDIENTS];
    }

    Pizza(String name, PizzaType pizzaType, Ingredients[] ingredients, int quantity) {
        super(name, quantity);
        this.name = name;
        this.quantity = quantity;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;

    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredients ingredient : ingredients) {
            if (ingredient != null) {
                ingredientPrice += ingredient.getPrice();
            }
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public void addIngredients(Ingredients ingredient) {
        if (toppingCount > MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Pizza is full");
        }
        if (!isExistingIngredient(ingredient)) {
            ingredients[toppingCount++] = ingredient;
        }
    }

    private boolean isExistingIngredient(Ingredients ingredient) {
        for (Ingredients ing : ingredients) {
            if (ingredient != null && ingredient.equals(ing)) {
                System.out.println("Ingredient " + ingredient.getName() + " already exists in Pizza");
                return true;
            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPizzaTypeName() {
        return pizzaType.getName();
    }

    public double getPizzaTypePrice() {
        return pizzaType.getPrice();
    }

    public Ingredients[] getIngredients() {
        if (ingredients == null) {
            System.out.println("You need at least one topping on the pizza");
            ingredients[toppingCount] = Ingredients.TOMATO;
        }
        return ingredients;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }
}
