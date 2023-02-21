package homework_6.Vazgen_Harutyunyan.chapter_8.pizza;
import java.util.*;

public class Pizza {
    String name;
    private List<String> ingredients;
    private String type;
    private int quantity;

    public Pizza(String name, String type, int quantity) {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        if (ingredients.size() >= 7) {
            System.out.println("Pizza is already full, cannot add more ingredients.");
        } else if (ingredients.contains(ingredient)) {
            System.out.println("Ingredient already added, please check your order again.");
        } else {
            ingredients.add(ingredient);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }
}
