package homework_7.gohar_hakobyan;

import homework_7.gohar_hakobyan.product.Product;

import java.time.LocalTime;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        printOrderDetails(order);
        printProductDetails(order.getProducts());
        printOrderTotalAmount(order);
        trailingLine();
    }

    private static void printOrderDetails(Order order) {
        System.out.println("Order date and time: " + LocalTime.now());
        System.out.println(order.getOrderNumber());
        System.out.println(order.getCustomerNumber());
    }

    private static void printProductDetails(Product[] products) {
        for (Product product : products) {
            if (product == null) {
                continue;
            }
            System.out.println("Name: " + product.getName());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Price: " + product.calculatePrice());
            System.out.println("--------------------------------");
        }
    }

    private static void printOrderTotalAmount(Order order) {
        System.out.println("Total amount " +
                order.calculateOrderAmount() + " €");
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trailingLine() {
        System.out.println("********************");
    }
}
