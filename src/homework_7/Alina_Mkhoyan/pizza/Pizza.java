package homework_7.Alina_Mkhoyan.pizza;


public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private PizzaType pizzaType;
    private Ingredient[] ingredients;


    public Pizza(String name, PizzaType pizzaType, int quantity) {
        super(name, pizzaType.getPrice(), quantity);
        this.pizzaType = pizzaType;
    }


    public Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        super(name, pizzaType.getPrice(), quantity);
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredients == null) {
            ingredients = new Ingredient[1];
            ingredients[0] = ingredient;
        } else if (ingredients.length < MAX_ALLOWED_INGREDIENTS) {
            Ingredient[] newIngredients = new Ingredient[ingredients.length + 1];
            System.arraycopy(ingredients, 0, newIngredients, 0, ingredients.length);
            newIngredients[ingredients.length] = ingredient;
            ingredients = newIngredients;
        }
    }


//    public void addIngredient(Ingredient ingredient) {
//        // todo implement a method tht will add ingredient into the list.
//        if (quantity > MAX_ALLOWED_INGREDIENTS) {
//            System.out.println("No more ingredients allowed.");
//            return;
//        }
//        ingredients[quantity++] = ingredient;
//    }


    public double calculatePrice() {
        double ingredientPrice = 0.0;
        if (ingredients != null) {
            for (Ingredient ingredient : ingredients) {
                ingredientPrice += ingredient.getPrice();
            }
        }
        return getPizzaType().getPrice() + ingredientPrice;
    }


    public void printProductDetails() {
        System.out.println(getName() + " (" + getPizzaType().getName() + ")");
        if (getIngredients() != null) {
            System.out.print("Ingredients: ");
            for (Ingredient ingredient : getIngredients()) {
                System.out.print(ingredient.getName() + ", ");
            }
            System.out.println();
        }
        System.out.println("Price: $" + calculatePrice());
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }


}


