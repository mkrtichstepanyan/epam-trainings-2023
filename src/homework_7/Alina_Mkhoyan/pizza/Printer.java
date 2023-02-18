package homework_7.Alina_Mkhoyan.pizza;

import java.util.Arrays;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        System.out.println("Customer: " + order.getCustomer().getName());
        System.out.println("Phone Number: " + order.getCustomer().getPhoneNumber());

        // Print pizza info
        for (Pizza pizza : order.getPizzas()) {
            System.out.println("--------------------");
            System.out.println("Pizza Name: " + pizza.getName());
            System.out.println("Pizza Type: " + pizza.getPizzaType().getName());
            System.out.println("Ingredients: " + Arrays.toString(pizza.getIngredients()));
            System.out.println("Price: " + pizza.calculatePrice());
            System.out.println("---------------------");
            System.out.println("Total amount : " + order.calculateOrderPrice() + " $");

        }

        printDelimiter();
        trainlingLine();

//        System.out.println("Total amount : " + order.calculateOrderPrice() + " $");

    }

    // todo print logic goes here.


    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void printDelimiter() {
        System.out.println("--------------------");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }


}
