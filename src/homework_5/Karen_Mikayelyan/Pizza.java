package homework_5.Karen_Mikayelyan;

import com.sun.source.doctree.LiteralTree;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public static final int MAX_INGREDIENTS = 7;
    public static final int MAX_QUANTITY_OF_PIZZAS = 10;
    private int index;
    private String name;
    private List<String> ingredients;
    private int ingredientCount;
    private String type;
    private int quantity;

    public Pizza(String name, String type, int quantity, int index, Customer customer) {
        if (quantity < MAX_QUANTITY_OF_PIZZAS) {
            if (name.length() < 4 || name.length() > 20) {
                this.index = index;
                this.name = customer.getName() + "_" + index;
            } else {
                this.name = name;
            }
            this.type = type;
            this.quantity = quantity;
            this.ingredients = new ArrayList<>();
            this.ingredientCount = 0;
        }
    }

    public void addIngredient(String ingredient) {
        if (ingredientCount >= MAX_INGREDIENTS) {
            System.out.println("The pizza's ingredients maximum number has already completed!");
            return;
        }
        for (int i = 0; i < ingredientCount; i++) {
            if (ingredients.contains(ingredient)) {
                System.out.println("The ingredients already added, please check the order");
                return;
            }
        }
        this.ingredients.add(ingredient);
    }

    public List<String> getIngredients() {
        return this.ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
