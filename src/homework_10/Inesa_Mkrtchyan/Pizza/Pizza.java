package homework_10.Inesa_Mkrtchyan.Pizza;

import homework_10.Inesa_Mkrtchyan.Ex.MyException;

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

    public void addIngredient(PizzaIngredient ingredient) throws MyException {
        if (ingredients.length == MAX_ALLOWED_INGREDIENTS) {
            throw new MyException("Pizza is full!!!!");
            //System.out.println("Pizza is full!!!!");

        }
        for (int i = 0; i < ingredients.length - 1; i++) {
            if (ingredients[i].name == ingredient.name) {
                throw  new MyException("You already have ingredient: " + ingredient.getName());
                //System.out.println("You already have this ingredient");
            } else {
                ingredients[i] = ingredient;
                return;
            }
        }
    }


}

