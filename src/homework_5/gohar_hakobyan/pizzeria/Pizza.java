package homework_5.gohar_hakobyan.pizzeria;

import java.util.ArrayList;

public class Pizza {
    private String name;
    private ArrayList<String> ingredients;
    private boolean isCalzone;
    private int quantity;

    public Pizza(String name, ArrayList<String> ingredients, boolean isCalzone, int quantity) {
        this.name = name;
        this.ingredients = ingredients;
        this.isCalzone = isCalzone;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public boolean isCalzone() {
        return this.isCalzone;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setName(String name) {
        this.name = name;

    }
}
