package homework_5.Karen_Sargsyan.Pizza;

public class Pizza {

    private final int quantity;
    private final PizzaType pizzaType;
    private String namePizza;
    private Ingredient[] ingredients;
    private int ingredientIndex;

    public Pizza(String namePizza, PizzaType pizzaType, int quantity) {
        this.pizzaType = pizzaType;
        this.namePizza = namePizza;
        this.quantity = quantity;

    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredientIndex == 0) {
            ingredients = new Ingredient[8];
        }
        if (ingredientIndex <= 7) {
            if (isDuplicate(ingredient)) {
                System.out.println("You have already added that ingredient to the pizza.");
            } else {
                ingredients[ingredientIndex++] = ingredient;
            }
        } else {
            System.out.println("You can't add more than 8 ingredients to pizza.");
        }
    }

    private boolean isDuplicate(Ingredient ingredient) {
        for (int i = 0; i < ingredientIndex; i++) {
            if (ingredients[i].equals(ingredient)) {
                return true;
            }
        }
        return false;
    }

    public String getNamePizza() {
        return namePizza;
    }

    public void setNamePizza(String namePizza) {
        this.namePizza = namePizza;
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

    public int getIngredientIndex() {
        return ingredientIndex;
    }

}
