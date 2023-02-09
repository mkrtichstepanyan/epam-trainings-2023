package homework_5.Gevorg_Martirosian.pizzaHomework;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {

    private static int orderNumber = 10000;
    private final int orderID;
    private Customer customer;
    private Pizza[] pizzas;
    private LocalDateTime orderTime;
    String formatDateTime;

    public Customer getCustomer() {
        return customer;
    }

    public static int getOrderNumber() {
        return orderNumber;
    }

    public Order(Customer customer, Pizza... pizzas) {
        orderID = Order.orderNumber++;
        this.customer = customer;
        this.pizzas = pizzas;
        orderTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        formatDateTime = orderTime.format(format);
    }

    public void printCheck() {
        double totalAmount = 0.0;
        double currentAmount = 0.0;

        System.out.println("********************************");
        System.out.println("Order: " + orderID);
        System.out.println("Client: " + customer.name + " " + customer.surname + " " + customer.getCustomerNumber());
        System.out.println("order time: " + formatDateTime);

        for (Pizza pizza : pizzas) {
            System.out.println("Name: " + pizza.getName());
            System.out.println("--------------------------------");

            switch (pizza.getType().toLowerCase()) {
                case "base":
                    System.out.println("pizza type: " + pizza.getType() + " 1 €");
                    currentAmount += 1;
                    break;
                case "calzone":
                    System.out.println("pizza type: " + pizza.getType() + " 1.5 €");
                    currentAmount += 1.5;
                    break;
            }
            String currentIngredient;
            System.out.println("ingredients:");
            for (int i = 0; i < pizza.getIngredients().length; i++) {
                currentIngredient = pizza.getIngredients()[i];
                if (currentIngredient != null) {
                    switch (currentIngredient.toLowerCase()) {
                        case "tomato paste":
                            System.out.println("tomato paste: 1 €");
                            currentAmount += 1;
                            break;
                        case "cheese":
                            System.out.println("cheese: 1 €");
                            currentAmount += 1;
                            break;
                        case "salami":
                            System.out.println("salami: 1.5 €");
                            currentAmount += 1.5;
                            break;
                        case "pepperoni":
                            System.out.println("pepperoni: 0.6 €");
                            currentAmount += 0.6;
                            break;
                        case "bacon":
                            System.out.println("bacon: 1.2 €");
                            currentAmount += 1.2;
                            break;
                        case "garlic":
                            System.out.println("garlic: 0.3 €");
                            currentAmount += 0.3;
                            break;
                        case "olives":
                            System.out.println("olives: 0.5 €");
                            currentAmount += 0.5;
                            break;
                        case "corn":
                            System.out.println("corn: 0.7 €");
                            currentAmount += 0.7;
                            break;
                    }
                }
            }
            System.out.println("--------------------------");
            System.out.println("amount: " + currentAmount + " €");
            System.out.println("quantity: " + pizza.getCount());
            System.out.println("--------------------------");
            totalAmount += currentAmount * pizza.getCount();
            currentAmount = 0.0;
        }
        System.out.println("total amount: " + totalAmount);
    }
}