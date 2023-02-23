package homework_7.Yeghia_Ansuryan.Palmetto;


public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private static final int MAX_PIZZA_AMOUNT = 10;

    private PizzaType pizzaType;
    private IngredientPizza[] ingredients = new IngredientPizza[7];
    private int indexOfIngredients = 0;

    Pizza(String name, PizzaType pizzaType, IngredientPizza[] ingredients, int quantity) {
        super(Order.PRODUCT_PIZZA, name, pizzaType, quantity);
        if (quantity > MAX_PIZZA_AMOUNT) {
            System.out.println("You may not order more then 10 Pizzas !");
            return;
        }
        this.pizzaType = pizzaType;
        addIngredient(ingredients);
    }

    public void addIngredient(IngredientPizza[] ingredients) {
        indexOfIngredients = ingredients.length - 1;
        if (indexOfIngredients < MAX_ALLOWED_INGREDIENTS) {
            for (int i = 0; i <= indexOfIngredients; i++) {
                if (ingredients[indexOfIngredients] != null) {
                    String tempIngredient = ingredients[i].getName();
                    for (int j = 0; j <= indexOfIngredients; j++) {
                        if (ingredients[j].getName().equals(tempIngredient) && j != i) {
                            System.out.println(tempIngredient + "  already this ingredient there is in your list !!");
                            return;
                        }
                    }
                }
            }
            this.ingredients = ingredients;
        } else {
            System.out.println("The pizza is already Full !");
        }
    }

    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            if (ingredient != null) {
                ingredientPrice += ingredient.getPrice();
            }
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public IngredientPizza[] getIngredients() {
        return ingredients;

    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

}

