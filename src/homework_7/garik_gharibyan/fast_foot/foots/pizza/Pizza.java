package homework_7.garik_gharibyan.fast_foot.foots.pizza;

import homework_7.garik_gharibyan.fast_foot.foots.Food;

public class Pizza extends Food {
    private final int MAX_INGREDIENT = 10;
    private final int MIN_INGREDIENT = 1;
    private final PizzaType pizzaType;
    private int topElementIngredients = -1;
    private Ingredient[] ingredients = new Ingredient[0];


    public Pizza(String name, int quantity, PizzaType pizzaType) {
        this.name = name;
        isValidQuantity(quantity);
        this.pizzaType = pizzaType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }


    public void addIngredient(Ingredient ingredient) {

        if (isExistIngredient(ingredient)) {
            return;
        }

        if (ingredients.length > 6) {
            System.out.println(name + " pizza ingredient are full");
        } else if (ingredients.length == 0) {
            extendCapacityIngredient();
            ingredients[++topElementIngredients] = ingredient;
        } else {
            extendCapacityIngredient();
            ingredients[++topElementIngredients] = ingredient;
        }
    }

    private void extendCapacityIngredient() {
        Ingredient[] newArrayIngredients = new Ingredient[ingredients.length + 1];
        for (int i = 0; i < ingredients.length; i++) {
            newArrayIngredients[i] = ingredients[i];
        }
        ingredients = newArrayIngredients;
    }

    private boolean isExistIngredient(Ingredient ingredient) {
        for (Ingredient i : ingredients) {
            if (i.getName().equals(ingredient.getName())) {
                System.out.println("in Pizza " + name + " " + ingredient.getName() + "ingredient already exist");
                return true;
            }
        }
        return false;
    }

    void isValidQuantity(int quantity) {
        if (quantity >= MAX_INGREDIENT) {
            this.quantity = MAX_INGREDIENT;
            System.out.println("We can make maximum 10 pizza");
        } else if (quantity <= MIN_INGREDIENT) {
            this.quantity = MIN_INGREDIENT;
            System.out.println("As you want lass then 1 we will make 1 pizza");
        } else {
            this.quantity = quantity;
        }
    }


    @Override
    public double getPrice() {
        double sum = pizzaType.getPizzaTypePrice();
        for (Ingredient i : ingredients) {
            sum = i.getPrice() + sum;
        }
        return sum;
    }


}
