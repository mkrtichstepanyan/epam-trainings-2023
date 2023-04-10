package homework_7.robert_nazaryan;

public class Pizza extends Product {

    private PizzaType pizzaType;
    private Ingredient[] ingredients;

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
        return (this.pizzaType.getPrice() + ingredientPrice) * quantity;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
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
}

