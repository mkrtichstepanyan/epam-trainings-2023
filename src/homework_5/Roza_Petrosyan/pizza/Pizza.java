package homework_5.Roza_Petrosyan.pizza;

import java.util.*;

public class Pizza {
    private String pizzaName;
    private Order order;
    private String pizzaType;
    private int quantity;


    private String[] currentPizzaIngredients = new String[1];

    public Pizza(String pizza_name, String pizza_type, int quantity, Order order) {
        if (pizza_name.length() >= 4 && pizza_name.length() <= 20 && pizza_name.matches("\\p{IsLatin}+")) {
            this.pizzaName = pizza_name;
        } else {
            this.pizzaName = order.getCustomer().getCustomer_name() + "_" + order.getOrder_number();
        }
        this.quantity = quantity;
        this.pizzaType = pizza_type;
        this.order = order;
    }


    public void displayPizzaAttributes() {
        System.out.println("[" + order.getOrder_number() +
                ":" + order.getCustomer().getCustomer_number() +
                ":" + getPizzaName() +
                ":" + getQuantity() + "]");
    }


    public static <T> boolean isDuplicate(final T[] values) {
        return Arrays.stream(values).distinct().count() != values.length;
    }

    public void addIngredient(String[] ingredients) {
        if (ingredients.length > 7) {
            System.out.println(pizzaName + " pizza is full");
        }

        System.out.println(Arrays.toString(ingredients));
        currentPizzaIngredients = ingredients;

        if (isDuplicate(ingredients)) {
            System.out.println("Please check your order again!");
        }
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public String getPizzaType() {
        return pizzaType;
    }

    public int getQuantity() {
        return quantity;
    }

    public String[] getCurrentPizzaIngredients() {
        return currentPizzaIngredients;
    }

    public Order getOrder() {
        return order;
    }
}

