package homework_10.Nona_Asatryan.pizzeriaExceptions;

import homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions.ProductQuantityException;
import homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions.ProductTypeException;

// is a
// has a
public class Pizza extends Product implements Ingredients {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;

    private String name;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;
    private int quantity;


    Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity, ProductType productType) throws ProductTypeException, ProductQuantityException {
        super(name, pizzaType.getPrice(), quantity, productType);
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        if (quantity == 0) {
            throw new ProductQuantityException();
        } else {
            this.quantity = quantity;
        }
        if (productType == null) {
            throw new ProductTypeException();
        } else {
            this.productType = productType;
        }
    }

    @Override
    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        if (ingredients.length >= MAX_ALLOWED_INGREDIENTS) {
            System.out.println("The pizza is already full!");
            return;
        }
        for (Ingredient value : ingredients) {
            if (value.equals(ingredient)) {
                System.out.println("The " + ingredient.getName() + " already exists in");
                return;
            }
        }
        Ingredient[] newIngredients = new Ingredient[ingredients.length + 1];
        System.arraycopy(ingredients, 0, newIngredients, 0, ingredients.length);
        newIngredients[ingredients.length] = ingredient;
        ingredients = newIngredients;
    }

    public static void printIngredients(Pizza pizza) {
        Ingredient[] pizzaIngredients = pizza.getIngredients();
        for (Ingredient ingredient : pizzaIngredients) {
            System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " €");
        }
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

    public void setName(String name) {
        this.name = name;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }
}

