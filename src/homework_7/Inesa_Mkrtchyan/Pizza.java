package homework_7.Inesa_Mkrtchyan;

// is a
// has a
public class Pizza extends Product {
    private static final int MAX_ALLOWED_INGREDIENTS = 7;
    private PizzaType pizzaType;

    Pizza(String name, PizzaType pizzaType, int quantity) {
        this.ingredients = new PizzaIngredient[MAX_ALLOWED_INGREDIENTS];
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;
    }

    Pizza(String name, PizzaType pizzaType, PizzaIngredient[] ingredients, int quantity) {
        this.ingredients = new PizzaIngredient[MAX_ALLOWED_INGREDIENTS];
        for (int i = 0; i < ingredients.length; i++) {
            this.ingredients[i] = ingredients[i];
        }
        this.name = name;
        this.pizzaType = pizzaType;
        this.quantity = quantity;

    }

    public void printProductSpecialInfo() {
        System.out.println("Pizza Base (" + pizzaType.getName() + ") " + pizzaType.getPrice() + "$");
    }

    @Override
    public Ingredient[] getIngredients() {
        int count = 0;
        for (Ingredient i : ingredients) {
            if (i != null) count++;
        }
        Ingredient[] ing = new Ingredient[count];
        for(int i = 0; i < count; i++){
            ing[i] = ingredients[i];
        }
        return ing;
    }


    public double calculatePrice() {
        double ingredientPrice = 0.0;
        for (Ingredient ingredient : ingredients) {
            if(ingredient != null)
            ingredientPrice += ingredient.getPrice();
        }
        return this.pizzaType.getPrice() + ingredientPrice;
    }

    public void addIngredient(PizzaIngredient ingredient) {
        if (ingredients.length == MAX_ALLOWED_INGREDIENTS) {
            System.out.println("Pizza is full!!!!");
            return;
        }
        for (int i = 0; i < ingredients.length - 1; i++) {
            if (ingredients[i].name == ingredient.name) {
                System.out.println("You already have this ingredient");
            } else {
                ingredients[i] = ingredient;
                return;
            }
        }
    }


}

