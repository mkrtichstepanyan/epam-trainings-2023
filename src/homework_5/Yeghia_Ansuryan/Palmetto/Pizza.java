package homework_5.Yeghia_Ansuryan.Palmetto;

public class Pizza {
    private String pizzaName;
    private final PizzaType type;
    private final int pizzaQuantity;
    private Ingredient[] ingredients;
    private int ingredientIndex;

    public Pizza(String pizzaName, PizzaType pizzaType, int pizzaQuantity) {
        this.pizzaName = pizzaName;
        this.type = pizzaType;
        this.pizzaQuantity = pizzaQuantity;

    }

    public String getPizzaName() {
        return pizzaName;
    }

    void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public PizzaType getType() {
        return type;
    }

    public int getPizzaQuantity() {
        return pizzaQuantity;
    }

    public int getIngredientIndex() {
        return ingredientIndex;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredientIndex == 0) {
            ingredients = new Ingredient[8];
        }
        if (ingredientIndex <= 7) {
            if (isDuplicate(ingredient)) {
                System.out.println("You have already added that ingredient to the pizza");
            } else {
                ingredients[ingredientIndex++] = ingredient;
            }
        } else {
            System.out.println("You can't add more than 8 ingredients to pizza");
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
}