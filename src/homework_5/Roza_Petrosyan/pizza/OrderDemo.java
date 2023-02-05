package homework_5.Roza_Petrosyan.pizza;

import java.util.Random;

public class OrderDemo {
    public static void main(String[] args) {
        // Part 1
        System.out.println("---------------Part 1---------------------");
        Customer customer1 = new Customer("Roza", 7717);

        Order order = new Order(customer1);

        PizzaIngredients pizzaIngredients = new PizzaIngredients();

        PizzaType pizzaType = new PizzaType();

        Pizza first_order = new Pizza("Margarita", "Pizza Base (Calzone)", 2, order);
        order.getPizza()[0] = first_order;

        Pizza second_order = new Pizza("PepperoniOro", "Pizza Base (Calzone)", 3, order);
        order.getPizza()[1] = second_order;

        Pizza third_order = new Pizza("Salami", "Regular", 1, order);
        order.getPizza()[2] = third_order;

        order.getPizza()[0].displayPizzaAttributes();


        // Part 2
        System.out.println("---------------Part 2---------------------");
        order.getPizza()[0].addIngredient(new String[]{"Tomato paste", "Garlic", "Pepper", "Bacon"});

        order.getPizza()[1].addIngredient(new String[]{"Tomato paste", "Cheese", "Pepperoni", "Olives"});

        order.getPizza()[2].addIngredient(new String[]{"Tomato paste", "Cheese", "Salami", "Olives"});



        // Part 3
        System.out.println("---------------Part 3---------------------");


        CheckPrint checkPrint = new CheckPrint(order, pizzaIngredients, pizzaType);
        checkPrint.printCheck(order.getPizza());

        // Part 4
        System.out.println("---------------Part 4---------------------");
        // This part already I have done in first part
        // Customer number 7717 wants to order 2 pcs. "Margarita" and 3 pcs. the usual "PepperoniOro".


        // Customer with number 4372 wants to order delivery of 12 pcs. usual pizzas "BasePZZ".
        Customer customer2 = new Customer("Roza_Petrosyan", 4372);
        Order order2 = new Order(customer2);
        Pizza first_order_for_second_client = new Pizza("BasePZZ", "Regular", 12, order2);
        order2.getPizza()[0] = first_order_for_second_client;

        order2.getPizza()[0].displayPizzaAttributes();

        System.out.println("---------------Part 5---------------------");
        System.out.println("Order Local Time is: " + order.getOrder_time());


    }
}
