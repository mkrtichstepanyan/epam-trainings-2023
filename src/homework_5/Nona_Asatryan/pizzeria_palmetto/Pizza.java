package homework_5.Nona_Asatryan.pizzeria_palmetto;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public static final int MAX_INGREDIENTS = 7;
    private String name;
    private final List<Ingredient> ingredients;
    private final PizzaType type;
    private final int quantity;

    public Pizza(String name, PizzaType type, int quantity, Customer customer) {
        if (name == null || name.length() < 4 || name.length() > 20) {
            this.name = customer.getName() + "_" + customer.getNumber();
        } else {
            this.name = name;
        }
        this.type = type;
        this.quantity = quantity;
        this.ingredients = new ArrayList<>(MAX_INGREDIENTS);
    }

    public void addIngredient(Ingredient ingredient) {
        if (ingredients.size() >= MAX_INGREDIENTS) {
            System.out.println("The pizza is already full.");
        } else if (ingredients.contains(ingredient)) {
            System.out.println("The ingredient already exists, please check the order again.");
        } else {
            ingredients.add(ingredient);
        }
    }

    public double calculatePizzaAmount(Pizza pizza) {
        double amount = 0;
        List<Ingredient> ingredients1 = pizza.getIngredients();
        for (int i = 0; i < ingredients1.size(); i++) {
            amount += ingredients1.get(i).getPrice();
        }
        return amount;
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

    public List<Ingredient> getIngredients() {
        return this.ingredients;
    }

    public PizzaType getType() {
        return this.type;
    }
}
