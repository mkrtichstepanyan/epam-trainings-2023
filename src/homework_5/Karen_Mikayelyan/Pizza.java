package homework_5.Karen_Mikayelyan;


import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public static final int MAX_INGREDIENTS = 7;
    public static final int MAX_QUANTITY_OF_PIZZAS = 10;
    private String name;
    private List<String> ingredients;
    private String type;
    private int quantity;

    public Pizza(String name, String type, int quantity, Customer customer) {
        if (quantity < MAX_QUANTITY_OF_PIZZAS) {
            if (name.length() < 4 || name.length() > 20) {
                this.name = customer.getName() + "_" + customer.getNumber();
            } else {
                this.name = name;
            }
            this.type = type;
            this.quantity = quantity;
            this.ingredients = new ArrayList<>();
        } else {
            System.out.println("You cant order more than 10 pizzas");
            System.exit(1);
        }
    }

    public void addIngredient(String ingredient) {
        if (ingredients.size() >= MAX_INGREDIENTS) {
            System.out.println("The pizza's ingredients maximum number has already completed!");
        }
        if (ingredients.contains(ingredient)) {
            System.out.println("The ingredients already added, please check the order");
        } else {
            this.ingredients.add(ingredient);
        }
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
