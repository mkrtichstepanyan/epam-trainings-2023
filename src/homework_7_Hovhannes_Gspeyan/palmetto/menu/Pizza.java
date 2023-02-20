package homework_7_Hovhannes_Gspeyan.palmetto.menu;

import homework_7_Hovhannes_Gspeyan.palmetto.Customer;

import java.util.Arrays;

// is a
// has a
public class Pizza extends MenuItem {

    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private static final int MAX_PIZZA_AMOUNT = 10;
    private int index;
    private Customer customer;

    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private Pizza[] pizzas = new Pizza[10];
    private int quantity;
    Pizza(String name, PizzaType pizzaType, int quantity) {
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
            validPizzaName = customer.getName() + "_" + pizzaIndex;
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
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public void addIngredient(Ingredient ingredient) {
        if(ingredients == null || ingredients.length == MAX_ALLOWED_INGREDIENTS){
            System.out.println("You can not add more ingredients! ");
            return;
        }
        for (int i = 0; i < ingredients.length; i++) {
            if(ingredients[i] == ingredients[i + 1]){
                System.out.println("you can not add the same ingredient twice! ");
                return;
            }
        }
        Arrays.fill(ingredients, ingredient);
        // todo implement a method tht will add ingredient into the list.
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

