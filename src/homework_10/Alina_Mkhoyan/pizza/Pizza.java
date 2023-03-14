package homework_10.Alina_Mkhoyan.pizza;


import homework_10.Alina_Mkhoyan.pizza.exception.OrderException;

public class Pizza {
    public static final int MAX_ALLOWED_INGREDIENTS = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int quantity;

    public Pizza() {
    }

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
        return (this.pizzaType.getPrice() + ingredientPrice) * getQuantity();
    }

    public Ingredient[] addIngredient(Ingredient[] ingredient) throws OrderException {
        if (ingredient.length > MAX_ALLOWED_INGREDIENTS) {
            throw new OrderException("You cannot order more than 7 ingredient quantity.");
        }
        return ingredient;
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
}



