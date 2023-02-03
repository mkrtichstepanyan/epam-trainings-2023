package homework_5.Alina_Mkhoyan.pizza;


import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private PizzaType type;
    private List<Ingredient> ingredients;
    private int quantity;
    private static final int MAX_ALLOWED_INGREDIENTS_SIZE = 7;

    public Pizza(String name, PizzaType type, int quantity) {
        this.checkPizzaName(name);
        this.type = type;
        this.quantity = quantity;
    }

    public void checkPizzaName(String pizzaName) {
        if (pizzaName.length() < 4 || pizzaName.length() > 20) {
            this.name = "customer_" + Order.getCustomerId() + "_" + Order.getOrderId();
        } else {
            this.name = pizzaName;
        }
    }

    public void addIngredients(String ingredientName) {
        if (ingredients == null) {
            ingredients = new ArrayList<>();
        }
        if (ingredients.size() == MAX_ALLOWED_INGREDIENTS_SIZE) {
            System.out.println("You can't add any more ingredients");
            return;
        }
        for (Ingredient ingredient1 : ingredients) {
            if (ingredient1.getName().equals(ingredientName)) {
                throw new IllegalArgumentException("You have already added that ingredient");
            }
        }
        for (Ingredient ingredient : Ingredient.values()) {
            if (ingredient.getName().equals(ingredientName)) {
                ingredients.add(ingredient);
            }
        }
    }

    public String getName() {
        return name;
    }

    public PizzaType getType() {
        return type;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.checkPizzaName(name);
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
