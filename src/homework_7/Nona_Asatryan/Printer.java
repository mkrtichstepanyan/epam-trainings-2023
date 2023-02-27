package homework_7.Nona_Asatryan;

import static homework_7.Nona_Asatryan.Pizza.printIngredients;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        printOrderInformation(order);
        delimiter();
        System.out.println("Total amount " + order.calculateOrderPrice() + " €");
        delimiter();
        System.out.println("Order time " + order.orderTime.getHour() + ":" + order.orderTime.getMinute());
        trailingLine();
    }

    public void printOrderAttributes(Order order) {
        for (Product product : order.getProducts()) {
            System.out.println("[" + order.getOrderNumber() + order.getCustomer().getNumber() + product.getName() + product.getQuantity() + "]");
        }
    }

    private static void printOrderInformation(Order order) {
        Product[] products = order.getProducts();
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Customer: " + order.getCustomer().getNumber());
        for (Product product : products) {
            if (product != null) {
                if (product.productType.equals(ProductType.PIZZA)) {
                    printPizzaCheck((Pizza) product);
                } else if (product.productType.equals(ProductType.DRINK)) {
                    printDrinkCheck((Drink) product);
                }
            }
        }
    }

    private static void printDrinkCheck(Drink product) {
        System.out.println("Name: " + product.getName());
        delimiter();
        double drinksAmount = product.calculatePrice();
        System.out.println("Amount: " + drinksAmount + " €");
        System.out.println("Quantity " + product.getQuantity());
        delimiter();
    }

    private static void printPizzaCheck(Pizza product) {
        System.out.println("Name: " + product.getName());
        delimiter();
        System.out.println("Pizza base (" + product.getPizzaType().getName() + ") " + (product.calculatePrice()) + " €");
        printIngredients(product);
        delimiter();
        double pizzaAmount = product.calculatePrice();
        System.out.println("Amount: " + pizzaAmount + " €");
        System.out.println("Quantity " + product.getQuantity());
        delimiter();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trailingLine() {
        System.out.println("********************");
    }

    private static void delimiter() {
        System.out.println("--------------------------");
    }
}
