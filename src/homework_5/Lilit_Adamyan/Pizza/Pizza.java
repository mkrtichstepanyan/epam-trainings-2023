package homework_5.Lilit_Adamyan.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private List<String> ingredients;
    private String type;
    private int quantity;
    private final int maxIngredients = 7;

    public Pizza(String name, String pizzaType, int quantity) {
        this.name = name;
        this.ingredients = new ArrayList<>();
        this.type = pizzaType;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void displayPizza() {
        System.out.println("[Order: Customer: Name: Quantity");

    }


    public void addIngredients(String ingredient) {
        if (ingredients.size() >= maxIngredients) {
            System.out.println("Pizza is already full");
            return;
        } else if (ingredients.contains(ingredient)) {
            System.out.println("Ingredient has already added .Please check the order again");
            return;
        }
        ingredients.add(ingredient);
    }


}