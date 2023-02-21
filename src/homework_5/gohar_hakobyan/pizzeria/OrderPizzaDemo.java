package homework_5.gohar_hakobyan.pizzeria;

import java.util.ArrayList;
import java.util.Arrays;

public class OrderPizzaDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("Gohar");
        Order order = new Order(10001, customer);
        order.addPizza("Margarita", new ArrayList<>(Arrays.asList(Ingredient.TOMATO_PASTE, Ingredient.GARLIC, Ingredient.BACON)), 2, PizzaType.REGUlAR, customer);
        order.addPizza("PepperoniOro", new ArrayList<>(Arrays.asList(Ingredient.TOMATO_PASTE, Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.OLIVES)), 3, PizzaType.REGUlAR, customer);
        order.addPizza("BaZ", new ArrayList<>(Arrays.asList(Ingredient.TOMATO_PASTE, Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.OLIVES)), 2, PizzaType.CALZONE, customer);
        order.printCheck();
        System.out.println(customer.getCustomerPhone());

        Customer customer2 = new Customer("Ann");
        Order order2 = new Order(10002, customer2);
        order2.addPizza("BasePZZ", new ArrayList<>(Arrays.asList(Ingredient.TOMATO_PASTE, Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.OLIVES)), 12, PizzaType.CALZONE, customer2);
        order2.printCheck();
    }
}
