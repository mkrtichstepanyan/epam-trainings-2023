package homework_7.Hovhannes_Gspeyan.palmetto.menu;

import homework_7.Hovhannes_Gspeyan.palmetto.Customer;
import homework_7.Hovhannes_Gspeyan.palmetto.exception.Error;
import homework_7.Hovhannes_Gspeyan.palmetto.exception.IngredientDuplicateException;
import homework_7.Hovhannes_Gspeyan.palmetto.exception.IngredientFullException;
import homework_7.Hovhannes_Gspeyan.palmetto.exception.PizzaQuantityFullException;

import static homework_7.Hovhannes_Gspeyan.palmetto.exception.Error.INGREDIENT_DUPLICATION;
import static homework_7.Hovhannes_Gspeyan.palmetto.exception.Error.MAX_INGREDIENT_QUANTITY;

public class Pizza implements MenuItem {

    private static final int MAX_PIZZA_AMOUNT = 10;
    private String name;
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private Customer customer;
    private PizzaType pizzaType;
    private int index;
    private Ingredient[] ingredients = new Ingredient[MAX_ALLOWED_INGREDIENTS];
    private int quantity;

    public Pizza() {

    }

    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) throws PizzaQuantityFullException {
        this.ingredients = ingredients;
        this.name = name;
        this.pizzaType = pizzaType;
        if (quantity > MAX_PIZZA_AMOUNT) {
            throw new PizzaQuantityFullException(Error.INVALID_NUMBER_OF_PIZZAS);
        } else {
            this.quantity = quantity;
        }
    }

    @Override
    public String getName() {
        return this.name = getValidPizzaName(name, index);
    }

    @Override
    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return (pizzaType.getPrice() + ingredientPrice) * quantity;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    public void addIngredient(Ingredient ingredient) throws IngredientFullException, IngredientDuplicateException {
        if (ingredients.length >= MAX_ALLOWED_INGREDIENTS) {
            throw new IngredientFullException(MAX_INGREDIENT_QUANTITY);
        }
        for (Ingredient value : ingredients) {
            if (value.equals(ingredient)) {
                throw new IngredientDuplicateException(INGREDIENT_DUPLICATION);
            }
        }
        Ingredient[] newIngredients = new Ingredient[ingredients.length + 1];
        System.arraycopy(ingredients, 0, newIngredients, 0, ingredients.length);
        newIngredients[ingredients.length] = ingredient;
        ingredients = newIngredients;
    }

    public PizzaType getPizzaType() {
        return this.pizzaType;
    }

    public Ingredient[] getIngredients() {
        return this.ingredients;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    public void setQuantity(int i) {
        this.quantity = i;
    }
}
