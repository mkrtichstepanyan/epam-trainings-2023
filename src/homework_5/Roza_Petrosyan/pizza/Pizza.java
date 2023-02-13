package homework_5.Roza_Petrosyan.pizza;

public class Pizza {
    private String pizzaName;
    private final PizzaType pizzaType;
    private final int quantity;
    private Ingredient[] ingredients;
    private int maxCount;

    public Pizza(String pizzaName, PizzaType pizzaType, int quantity) {
        this.pizzaName = pizzaName;
        this.quantity = quantity;
        this.pizzaType = pizzaType;
    }

    public boolean isDuplicate(Ingredient[] ingredients) {
        boolean result = false;
        if (ingredients != null) {
            int countOfIngredients = 0;
            for (int i = 0; i < ingredients.length; i++) {
                int count = 1;
                for (int j = i + 1; j < ingredients.length; j++) {
                    if (ingredients[i] != null) {
                        if (ingredients[i].equals(ingredients[j])) {
                            result = true;
                            count++;
                        }
                    }
                }
                if (count == 1) {
                    if(ingredients[i] != null){
                        countOfIngredients++;
                    }
                }
            }
            maxCount = countOfIngredients;
        }
        return result;
    }

    public void addIngredient(Ingredient[] ingredients) {
        if (isDuplicate(ingredients)) {
            System.out.println("Please check your order again. You have duplication of ingredients." +
                    "\nThis pizza will not be included in your order list");
        }
        if (maxCount > 7) {
            System.out.println(pizzaName + " pizza is full." +
                    "\nThis pizza will not be included in your order list");
        }
        this.ingredients = ingredients;
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

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public int getMaxCount() {
        return maxCount;
    }
}

