package homework_5.gohar_hakobyan.pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private ArrayList<String> ingredients;
    private int quantity;
    private PizzaType pizzaType;
    private List<Pizza> pizzas;

    public Pizza(String name, ArrayList<String> ingredients,
                 int quantity, PizzaType pizzaType, Customer customer) {
        if (name == null || name.length() < 4 || name.length() > 20) {
            name = customer.getName() + pizzas.size();
        }
        this.name = name;
        this.ingredients = ingredients;
        this.quantity = quantity;
        this.pizzas = new ArrayList<>();
        this.pizzaType = pizzaType;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }


    public int getQuantity() {
        return this.quantity;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setName(String name) {
        this.name = name;
    }
}
