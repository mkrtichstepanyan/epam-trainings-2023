package homework_5.Nona_Asatryan.pizzeria_palmetto;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public static final int MAX_INGREDIENTS = 7;
    private String name;
    private  List<String> ingredients;
    private final PizzaType type;
    private final int quantity;
    private int index;

    public Pizza(String name, PizzaType type, int quantity, Customer customer, int index) {
        if (name.length() < 4 || name.length() > 20) {
            this.index = index;
            this.name = customer.getName() + "_" + index;
        } else {
            this.name = name;
        }
        this.type = type;
        this.quantity = quantity;
        this.ingredients = new ArrayList<>(MAX_INGREDIENTS);
    }

    public Pizza(String name, PizzaType type, int quantity) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.ingredients = new ArrayList<>(MAX_INGREDIENTS);
    }

    public void addIngredient(String ingredient) {
        if (ingredients.size() >= MAX_INGREDIENTS) {
            System.out.println("The pizza is already full.");
        } else if (ingredients.contains(ingredient)) {
            System.out.println("The ingredient already exists, please check the order again.");
        } else {
            ingredients.add(ingredient);
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

    public int getIndex() {
        return index;
    }
}
