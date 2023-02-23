package homework_7.Hovhannes_Gspeyan.palmetto.menu;

import homework_7.Hovhannes_Gspeyan.Customer;

// is a
// has a
public class Pizza extends MenuItem {

    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private static final int MAX_PIZZA_AMOUNT = 10;
    private int index;
    private Customer customer;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private final Pizza[] pizzas = new Pizza[10];
    private int quantity;

    public Pizza() {

    }

    public Pizza(String name, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }

    private String getValidPizzaName(String pizzaName, int pizzaIndex) {
        String validPizzaName = pizzaName;
        if (!isValidPizzaName(pizzaName)) {
            validPizzaName = this.customer.getName() + "_" + pizzaIndex;
        }
        return validPizzaName;
    }

    private boolean isValidPizzaName(String pizzaName) {
        return pizzaName != null && pizzaName.length() > 4 && pizzaName.length() < 20;
    }

    public void addPizza(String pizzaName, PizzaType type,
                         Ingredient[] ingredients, int quantity) {
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("The maximum number of pizzas cannot be more than 10!!!");
            return;
        }
        int pizzaIndex = index++;
        String validPizzaName = getValidPizzaName(pizzaName, pizzaIndex);
        pizzas[pizzaIndex] = new Pizza(validPizzaName, type, ingredients, quantity);
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return (pizzaType.getPrice() + ingredientPrice) * quantity;
    }
    public void addIngredient(Ingredient ingredient) {
        if (ingredients.length >= MAX_ALLOWED_INGREDIENTS) {
            System.out.println("The " + getName() + " is already full! You cannot add more ingredients! ");
            return;
        }
        for (Ingredient value : ingredients) {
            if (value.equals(ingredient)) {
                System.out.println("The " + ingredient.getName() + " already exists in " + getName() + "!, Please remove it ");
                return;
            }
        }
        Ingredient[] newIngredients = new Ingredient[ingredients.length + 1];
        System.arraycopy(ingredients, 0, newIngredients, 0, ingredients.length);
        newIngredients[ingredients.length] = ingredient;
        ingredients = newIngredients;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getName() {
        return getValidPizzaName(name, index);
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

