package homework_5.Roza_Petrosyan.pizza;

public class Pizza {
    private String pizzaName;
    private final PizzaType pizzaType;
    private final int quantity;
    private Ingredient[] ingredients;

    public Pizza(String pizzaName, PizzaType pizzaType, int quantity) {
        this.pizzaName = pizzaName;
        this.quantity = quantity;
        this.pizzaType = pizzaType;
    }

    private boolean isDuplicate(Ingredient[] ingredients) {
        boolean result = false;
        int countOfIngredients = 0;
        Ingredient[] temp = new Ingredient[ingredients.length];
        for (int i = 0; i < ingredients.length; i++) {
            int count = 1;
            for (int j = i + 1; j < ingredients.length; j++) {
                if (ingredients[i].equals(ingredients[j])) {
                    result = true;
                    count++;
                }
            }
            if(count == 1) {
                temp[i] = ingredients[i];
                countOfIngredients++;
            }
        }
        this.ingredients = temp;

        if (countOfIngredients > 7) {
            System.out.println(pizzaName + " pizza is full");
        }
        return result;
    }

    public void addIngredient(Ingredient[] ingredients) {
        if (isDuplicate(ingredients)) {
            System.out.println("Please check your order again!");
        }
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
}

