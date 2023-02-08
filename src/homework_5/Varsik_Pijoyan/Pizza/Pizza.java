package homework_5.Varsik_Pijoyan.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private List<String> pizzaIngredients;
    private int quantity;
    private String type;


    public Pizza(String name, String type, int quantity, Customer customer) {
        if (quantity < 10) {
            if (name.length() < 4 || name.length() > 20) {
                this.name = customer.getName() + "_" + customer.getNumber();
            } else {
                this.name = name;
            }
            this.type = type;
            this.quantity = quantity;
            this.pizzaIngredients= new ArrayList<>();
        } else {
            System.out.println("You cant order more than 10 pizzas");
            System.exit(1);
        }
    }

    public void addIngredient(String ingredient) {
        if (pizzaIngredients.size() >= 7) {
            System.out.println("The Pizza is full");
        }
        if (pizzaIngredients.contains(ingredient)) {
            System.out.println("You can't add more. The ingredients are already added. Please check the order");
        } else {
            this.pizzaIngredients.add(ingredient);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return this.pizzaIngredients;
    }


    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
