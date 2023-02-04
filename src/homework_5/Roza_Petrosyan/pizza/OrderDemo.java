package homework_5.Roza_Petrosyan.pizza;

public class OrderDemo {
    public static void main(String[] args) {
        // Part 1
        System.out.println("---------------Part 1---------------------");
        Customer customer1 = new Customer("Roza", 7717);
        Order order = new Order(customer1, "10001");
        PizzaIngredients pizzaIngredients = new PizzaIngredients();
        PizzaType pizzaType = new PizzaType();
        Pizza pizzaInit = new Pizza(order, customer1, pizzaIngredients, pizzaType);
        Pizza first_order = new Pizza("Margarita", "Pizza Base (Calzone)", 2);
        order.pizza.add(0, first_order);

        Pizza second_order = new Pizza("PepperoniOro", "Pizza Base (Calzone)", 3);
        order.pizza.add(1, second_order);

        Pizza third_order = new Pizza("Salami", "Regular", 1);
        order.pizza.add(2, third_order);

//        order.checkOrderNumber(order.getOrder_number());
        order.pizza.get(0).displayPizzaAttributes();
        order.pizza.get(0).checkPizzaName("Margarita");
//        order.pizza.get(0).checkPizzaName("Peperonii14875451оолоыровиыо");


        // Part 2
        System.out.println("---------------Part 2---------------------");
        order.pizza.get(0).addIngredient(new String[]{"Tomato paste", "Garlic", "Pepper", "Bacon"});
//        order.pizza.get(0).addIngredient(new String[]{"Tomato paste", "Garlic", "Pepper"});
//        order.pizza.get(0).addIngredient(new String[]{"Tomato paste", "Garlic", "Pepper", "Pepper"});

        order.pizza.get(2).addIngredient(new String[]{"Tomato paste", "Cheese", "Salami", "Olives"});
//        order.pizza.get(2).addIngredient(new String[]{"Tomato paste", "Cheese", "Salami"});
//        order.pizza.get(2).addIngredient(new String[]{"Tomato paste", "Cheese", "Salami", "Salami"});

        order.pizza.get(1).addIngredient(new String[]{"Tomato paste", "Cheese", "Pepperoni", "Olives"});

        // Part 3
        System.out.println("---------------Part 3---------------------");

        pizzaInit.printCheck(order.pizza);

        // Part 4
        System.out.println("---------------Part 4---------------------");
        // This part already I have done in first part
        // Customer number 7717 wants to order 2 pcs. "Margarita" and 3 pcs. the usual "PepperoniOro".


        // Customer with number 4372 wants to order delivery of 12 pcs. usual pizzas "BasePZZ".
        Customer customer2 = new Customer("Roza_Petrosyan", 4372);
        Order order2 = new Order(customer2, "10002");
        Pizza pizzaInit2 = new Pizza(order2, customer2, pizzaIngredients, pizzaType);
        Pizza first_order_for_second_client = new Pizza("BasePZZ", "Regular", 12);
        order2.pizza.add(0, first_order_for_second_client);

//        order2.setOrder_number("10002");
        order2.pizza.get(0).displayPizzaAttributes();

        System.out.println("---------------Part 5---------------------");
        System.out.println("Order Local Time is: " + order.order_time);


    }
}
