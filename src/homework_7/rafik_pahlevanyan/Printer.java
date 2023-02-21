package homework_7.rafik_pahlevanyan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Printer {

    public static void printCheck(Order order) {

        printHeader();
        printOrderInfo(order);
        printPizzaInfo(order.getPizzas());
        printOrderPrice(order);
        printFooter();

    }

    private static void printHeader() {
        System.out.println("*******************************");
        System.out.println("Order Time: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm ")));

    }

    private static void printOrderInfo(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
        System.out.println("*****************************");
    }

    private static void printPizzaInfo(Pizza[] pizzas) {
        for (int i = 0; i < pizzas.length; i++) {
            Pizza pizza = pizzas[i];
            if (pizza != null) {
                System.out.println("Name: " + pizza.getName());
                System.out.println("------------------------");
                System.out.println("Pizza Base: " + pizza.getPizzaType().getName() + " "
                        + pizza.getPizzaType().getPrice() + " $");
                printIngredients(pizza.getIngredients());
                System.out.println("------------------------");
                System.out.println("Quantity: " + pizza.getQuantity());
                System.out.println("Amount: " + pizza.calculatePrice() + " $");
                System.out.println("------------------------");
            }
        }
    }


    private static void printOrderPrice(Order order) {
        System.out.println("Total Amount: " + order.calculateOrderPrice() + " $");
    }

    private static void printFooter() {
        System.out.println("******************************");
        System.out.println();
        System.out.println();
    }

    private static void printIngredients(Ingredient[] ingredients) {

            for (Ingredient ingredient : ingredients) {
                if (ingredient != null) {
                System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " $");
            }
        }
    }


}
