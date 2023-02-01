package homework_5.pizza;


public class Pizza {

    private static final int MAX_ALLOWED_INGREDIENTS_SIZE = 7;

    public String name;
    private PizzaType pizzaType;
    private Ingredients[] ingredients;
    private int ingredientsCount;
    private int quantity;


    public Pizza(String name) {
        this.name = name;
        this.ingredients = new Ingredients[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = PizzaType.getCalzoneType();
    }


    public Pizza(String name, PizzaType pizzaType) {
        this.name = name;
        this.ingredients = new Ingredients[MAX_ALLOWED_INGREDIENTS_SIZE];
        this.pizzaType = pizzaType;
    }

    public Pizza(String name, PizzaType pizzaType, Ingredients[] ingredients) {
        this.name = name;
        this.pizzaType = pizzaType;
        if (ingredients.length > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("Ingredients more than allowed " + MAX_ALLOWED_INGREDIENTS_SIZE);
            this.ingredients = new Ingredients[MAX_ALLOWED_INGREDIENTS_SIZE];
        } else {
            this.ingredients = ingredients;
        }
    }

    public double calculatePrice() {
        double price = 0;
        price = price + pizzaType.getPrice();

        for (Ingredients ingredient : ingredients) {
            if (ingredient == null) {
                break;
            } else {
                price += ingredient.getPrice();
            }
        }
        return price * quantity;
    }


    public void addIngredients(Ingredients ingredient) {
        if (ingredientsCount > MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("No more ingredients allowed.");
            return;
        }
        ingredients[ingredientsCount++] = ingredient;
    }

    public int setQuantity(int quantity) {
        if (quantity > 10) {
            System.out.println("Quantity can't be more than 10");
            return this.quantity = 10;
        } else {
            return this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public Ingredients[] getIngredients() {
        return ingredients;
    }

}
