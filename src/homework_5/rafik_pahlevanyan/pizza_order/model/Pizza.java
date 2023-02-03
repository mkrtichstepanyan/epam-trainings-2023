package homework_5.rafik_pahlevanyan.pizza_order.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private static final int MAX_QUANTITY_OF_PIZZAS = 10;

    private  String name;
    private  List<String> ingredients;
    private  PizzaType type;
    private  int quantity;

    public Pizza(String name, PizzaType type, int quantity) {
        if (quantity < MAX_QUANTITY_OF_PIZZAS){
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.ingredients = new ArrayList<>();
        } else {
            System.out.println("You cant order more than 10");
            System.exit(1);
        }
    }

    public void addIngredient(String ingredient) {
        if (this.ingredients.size() >= 7) {
            System.out.println("The pizza is already full");
        } else if (this.ingredients.contains(ingredient)) {
            System.out.println("The ingredient is already added. Please check the order again");
        } else {
            this.ingredients.add(ingredient);
        }
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public List<String> getIngredients() {
        return this.ingredients;
    }

    public PizzaType getType() {
        return this.type;
    }
}