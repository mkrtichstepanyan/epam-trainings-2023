package homework_6.Vazgen_Harutyunyan.chapter_8.pizza;
import java.util.*;

public class Order {
    private int orderNumber;
    private int customerNumber;
    private List<Pizza> pizzas;

    public Order(int orderNumber) {
        this.orderNumber = orderNumber;
        this.customerNumber = customerNumber;
        pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        if (pizza.getName().length() < 4 || pizza.getName().length() > 20) {
            pizza.name = "customer_" + customerNumber + "_" + (pizzas.size() + 1);
        }
        pizzas.add(pizza);
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void displayPizzaAttributes() {
        for (Pizza pizza : pizzas) {
            System.out.println("[Order: " + orderNumber + " : Customer: " + customerNumber + " : Name: " + pizza.getName() + " : Quantity: " + pizza.getQuantity() + "]");
        }
    }

    public void printCheck() {
        System.out.println("********************************");
        System.out.println("Order Number: " + orderNumber);
        System.out.println("Customer Number: " + customerNumber);
        System.out.println("Pizzas: ");
        for (Pizza pizza : pizzas) {
            System.out.println("Name: " + pizza.getName());
            System.out.println("Ingredients: " + pizza.getIngredients());
            System.out.println("Type: " + pizza.getType());
            System.out.println("Quantity: " + pizza.getQuantity());
        }
        System.out.println("********************************");
    }
}
