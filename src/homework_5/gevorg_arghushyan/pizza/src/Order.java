package homework_5.gevorg_arghushyan.pizza.src;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Order {
    private static final Pattern NAME_PATTERN = Pattern.compile("^[A-Za-z]{4,20}$");
    private static int nextOrderNumber = 10001;
    private int orderNumber;
    private int customerNumber;
    private List<Pizza> pizzas;

    public Order(int customerNumber) {
        this.orderNumber = nextOrderNumber++;
        this.customerNumber = customerNumber;
        this.pizzas = new ArrayList<>();
    }

    public Order() {
    }

    public void addPizza(String name, String type, List<String> ingredients, int quantity) {
        Matcher matcher = NAME_PATTERN.matcher(name);
        if (!matcher.matches()) {
            name = "customer_" + customerNumber + "_" + (pizzas.size() + 1);
        }
        pizzas.add(new Pizza(name, type, ingredients, quantity));
    }

    public void display() {
        for (Pizza pizza : pizzas) {
            System.out.println("[" + orderNumber + " : " + customerNumber + " : " + pizza.getName() + " : " + pizza.getQuantity() + "]");
        }
    }
}
