package homework_5.gohar_hakobyan.pizzeria;

import java.util.ArrayList;

public class Pizza {
    private String name;
    private ArrayList<String> ingredients;
    private int quantity;
    private PizzaType pizzaType;

    public Pizza(String name, ArrayList<String> ingredients,
                 int quantity, PizzaType pizzaType) {
        if (name == null) {
            name = "Pizza" + (int) (Math.random() * 1000);
        }
        this.name = name;
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.pizzaType = pizzaType;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }


    public int getQuantity() {
        return this.quantity;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setName(String name) {
        this.name = name;
    }
}
