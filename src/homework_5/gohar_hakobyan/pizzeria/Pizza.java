package homework_5.gohar_hakobyan.pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private ArrayList<Ingredient> ingredients;
    private int quantity;
    private PizzaType pizzaType;
    private List<Pizza> pizzas;

    public Pizza(String name, ArrayList<Ingredient> ingredients,
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

    public ArrayList<Ingredient> getIngredients() {
        return this.ingredients;
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

    public PizzaType getPizzaType() {
        return pizzaType;
    }


}
