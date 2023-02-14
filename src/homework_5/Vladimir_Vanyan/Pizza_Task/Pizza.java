package homework_5.Vladimir_Vanyan.Pizza_Task;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String pizzaName;
    private String type;
    private int quantity;
    List<String> pizzaIngredients;

    Pizza(String pizzaName, String type, int quantity, Customer customer) {
        if (quantity < 10) {
            if (pizzaName.length() < 4 || pizzaName.length() > 20) {
                this.pizzaName = customer.getName() + "_" + customer.getNumber();
            } else {
                this.pizzaName = pizzaName;
            }
            this.type = type;
            this.quantity = quantity;
            this.pizzaIngredients = new ArrayList<>();
        } else {
            System.out.println("You have to choose less than 10 pizzas");
            System.exit(1);
        }
    }

    public void addIngredient(String ingredient) {
        if (pizzaIngredients.size() >= 7) {
            System.out.println("You cant add ingredient");
        }
        if (pizzaIngredients.contains(ingredient)) {
            System.out.println("You can't add an existing ingredient");
        } else {
            this.pizzaIngredients.add(ingredient);
        }
    }

    public String getName() {

        return pizzaName;
    }

    public void setName(String pizzaName) {
        this.pizzaName = pizzaName;
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
