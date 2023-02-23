package homework_7.Radik_Manasyan.utils;

import homework_7.Radik_Manasyan.orders.Order;
import homework_7.Radik_Manasyan.products.Ingredient;
import homework_7.Radik_Manasyan.products.Products;

public class PrintOrdersCheck {

    public static void printCheck(Order order) {
        order.printOrderAttributes();

        leadingLine();

        orderClientPizzaInfo(order);
        bodyCheck(order);
        totalCoast(order);

        trainlingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void orderClientPizzaInfo(Order order) {
        System.out.println("Order: " + order.getOrderNumber() + "\nClient: " + order.getCustomer().getNumber());
    }

    private static void bodyCheck(Order order) {
        for (Products product : order.getOrder()) {
            if (product != null) {

                System.out.println("Name: " + product.getName() + "\n-------------------------");
                System.out.println(product.getProductType().getName() + " " +
                        String.format("%.2f", product.getProductType().getPrice()) + " " +
                        order.getCustomer().getCurrency());
                for (Ingredient ingredient : product.getIngredients()) {
                    System.out.println(ingredient.getName() + " " + String.format("%.2f", ingredient.getPrice()) + " " +
                            order.getCustomer().getCurrency());
                }
                System.out.println("--------------------------------\n" +
                        "Amount: " + String.format("%.2f", product.calculatePrice()) + " " + order.getCustomer().getCurrency() +
                        "\nQuantity: " + product.getQuantity() +
                        "\n--------------------------------");
            }
        }
    }

    private static void totalCoast(Order order) {
        String totalAmount = String.format("%.2f", order.calculateOrderPrice());
        System.out.println("Total Amount: " + totalAmount + " " + order.getCustomer().getCurrency());
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }
}
