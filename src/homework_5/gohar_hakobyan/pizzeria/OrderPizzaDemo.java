package homework_5.gohar_hakobyan.pizzeria;

import java.util.ArrayList;
import java.util.Arrays;

public class OrderPizzaDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("Gohar");
        Order order = new Order(10001, customer);
        order.addPizza("Margarita", new ArrayList<>(Arrays.asList("Tomato paste", "Pepper", "Garlic", "Bacon")), 2, PizzaType.REGUlAR);
        order.addPizza("PepperoniOro", new ArrayList<>(Arrays.asList("Tomato paste", "Cheese", "Salami", "Olives")), 3, PizzaType.REGUlAR);
        order.printCheck();
        System.out.println(customer.getCustomerPhone());

        Customer customer2 = new Customer("Ann");
        Order order2 = new Order(10002, customer2);
        order2.addPizza("BasePZZ", new ArrayList<>(Arrays.asList("Tomato paste", "Cheese", "Salami", "Olives")), 12, PizzaType.CLOSED);
        order2.printCheck();
    }
}
