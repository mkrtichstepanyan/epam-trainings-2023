package homework_5.Araksya_Ghazaryan.Palmetto;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private List<String> ingredients;
    private PizzaType type;
    private int quantity;
    private int maxPizza = 10;

    public Pizza(String name, PizzaType type, int quantity, Customer customer) {
        if (quantity < maxPizza ) {
            if (name.length() < 4 || name.length() > 20) {
                this.name = customer.getName() + "_" + customer.getNumber();
            } else {
                this.name = name;
            }
            this.type = type;
            this.quantity = quantity;
            this.ingredients = new ArrayList<>();
        } else {
            System.out.println("You cant order only 10 pizzas");
            System.exit(1);
        }
    }
    public void addIngredient(String ingredient) {
        if (this.ingredients.size() >= 7) {
            System.out.println("The pizza is full");
        } else if (this.ingredients.contains(ingredient)) {
            System.out.println("Continue");
        } else {
            this.ingredients.add(ingredient);
        }
    }
    public String getName() {
        return this.name;
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