package homework_5.Roza_Petrosyan.pizza;

public class OrderDemo {
    public static void main(String[] args) {
        // Part 1
        System.out.println("---------------Part 1---------------------");
        Order order = new Order();
        Order.Pizza first_order = new Order.Pizza("Margarita", "Pizza Base (Calzone)", 2);
        order.pizza.add(0, first_order);

        Order.Pizza second_order = new Order.Pizza("PepperoniOro", "Pizza Base (Calzone)", 3);
        order.pizza.add(1, second_order);

        Order.Pizza third_order = new Order.Pizza("Salami", "Regular", 1);
        order.pizza.add(2, third_order);

        Order.setCustomer_name("Roza");
        Order.setOrder_number("10001");
//        Order.setOrder_number("1000145587458745");
//        order.checkOrderNumber(Order.getOrder_number());
        Order.setCustomer_number(7717);
        order.pizza.get(0).displayPizzaAttributes();
        order.pizza.get(0).checkPizzaName("Margarita");
//        order.pizza.get(0).checkPizzaName("Peperonii14875451оолоыровиыо");


        // Part 2
        System.out.println("---------------Part 2---------------------");
        order.pizza.get(0).addIngredient("Margarita", new String[]{"Tomato paste", "Garlic", "Pepper", "Bacon"});
//        order.pizza.get(0).addIngredient("Margarita", new String[]{"Tomato paste", "Garlic", "Pepper"});
//        order.pizza.get(0).addIngredient("Margarita", new String[]{"Tomato paste", "Garlic", "Pepper", "Pepper"});

        order.pizza.get(2).addIngredient("Salami", new String[]{"Tomato paste", "Cheese", "Salami", "Olives"});
//        order.pizza.get(2).addIngredient("Salami", new String[]{"Tomato paste", "Cheese", "Salami"});
//        order.pizza.get(2).addIngredient("Salami", new String[]{"Tomato paste", "Cheese", "Salami", "Salami"});

        order.pizza.get(1).addIngredient("PepperoniOro", new String[]{"Tomato paste", "Cheese", "Pepperoni", "Olives"});

        // Part 3
        System.out.println("---------------Part 3---------------------");

        Order.Pizza.printCheck(order.pizza);

        // Part 4
        System.out.println("---------------Part 4---------------------");
        // This part already I have done in first part
        // Customer number 7717 wants to order 2 pcs. "Margarita" and 3 pcs. the usual "PepperoniOro".


        // Customer with number 4372 wants to order delivery of 12 pcs. usual pizzas "BasePZZ".

        Order.Pizza first_order_for_second_client = new Order.Pizza("BasePZZ", "Regular", 12);
        order.pizza.add(0, first_order_for_second_client);
        Order.setCustomer_name("Roza_Petrosyan");
        Order.setOrder_number("10002");
        Order.setCustomer_number(4372);
        order.pizza.get(0).displayPizzaAttributes();

        System.out.println("---------------Part 5---------------------");
        System.out.println("Order Local Time is: " + order.order_time);


    }
}
