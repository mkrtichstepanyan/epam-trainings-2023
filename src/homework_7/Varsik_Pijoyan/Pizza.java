package homework_7.Varsik_Pijoyan;

// is a
// has a
public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    public static final Pizza MARGARITA = new Pizza("Margarita", PizzaType.CALZONE, new Ingredient[]
            {Ingredient.TOMATO_PASTE, Ingredient.PEPPERONI, Ingredient.GARLIC, Ingredient.BACON}, 1);
    public static final Pizza PEPPERONI = new Pizza("Pepperoni", PizzaType.REGULAR, new Ingredient[]
            {Ingredient.TOMATO_PASTE, Ingredient.CHEESE, Ingredient.PEPPERONI, Ingredient.OLIVES}, 1);


    private PizzaType pizzaType;
    private Ingredient[] ingredients = new Ingredient[10];



    Pizza(String name, PizzaType pizzaType, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    Pizza(String name, PizzaType pizzaType, Ingredient[] ingredients, int quantity) {
        this.name = name;
        this.pizzaType = pizzaType;
        this.ingredients = ingredients;
        this.quantity = quantity;
    }


    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for ( Ingredient ingredient : ingredients) {
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }


    public void addIngredient(Ingredient ingredient) {
        // todo implement a method tht will add ingredient into the list.
        if (ingredients.length == MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Pizza is full");
        } else {
            isExistInPizza(ingredient);
        }
    }

    private boolean isExistInPizza(Ingredient ingredient) {
        for (int i = 0; i < ingredients.length; i++) {
            if (ingredient.equals(ingredients[i])) {
                System.out.println("This ingredient is already exist!");
                return false;
            } else {
                ingredients[i++] = ingredient;
            }
        }
        return true;
    }


    public Ingredient[] getIngredients() {
        return ingredients;
    }
    public PizzaType getPizzaType(){
        return pizzaType;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

}

