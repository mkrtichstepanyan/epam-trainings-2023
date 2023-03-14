package homework_10.anna_manukyan.pizzeria;


import homework_10.anna_manukyan.pizzeria.enums.ProductType;
import homework_10.anna_manukyan.pizzeria.pizza.Pizza;
import homework_10.anna_manukyan.pizzeria.product.Product;
import homework_10.anna_manukyan.pizzeria.product.Sweets;

import java.util.List;

import static homework_10.anna_manukyan.pizzeria.pizza.Pizza.printPizzaIngredients;


public class Printer {
    public static void printCheck(Order order) {
        leadingLine();
        printOrderInformation(order);
        delimiter();
        System.out.println("Total amount " + order.calculateOrderAmount() + " €");
        delimiter();
        System.out.println("Order time " + order.orderTime.getHour() + ":" + order.orderTime.getMinute());
        trailingLine();
    }

    public void printOrderAttributes(Order order) {
        for (Product product : order.getFoods()) {
            System.out.println("[" + order.getOrderNumber() + order.getCustomer().getNumber() + product.getName() + product.getQuantity() + "]");
        }
    }

    private static void printOrderInformation(Order order) {
        Product[] products = order.getFoods();
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
        for (Product product : products) {
            if (product != null) {
                if (product.productType.equals(ProductType.PIZZA)) {
                    printPizzaCheck((Pizza) product);
                } else if (product.productType.equals(ProductType.SWEETS)) {
                    printSweetCheck((Sweets) product);
                }
            }
        }
    }

    private static void printSweetCheck(Sweets food) {
        System.out.println("Name: " + food.getName());
        delimiter();
        System.out.println("Food type (" + food.getName() + ") ");
        delimiter();
        double sweetsAmount = food.calculatePrice();
        System.out.println("Amount: " + sweetsAmount + " €");
        System.out.println("Quantity " + food.getQuantity());
        delimiter();
    }

    private static void printPizzaCheck(Pizza food) {
        System.out.println("Name: " + food.getName());
        delimiter();
        System.out.println("Pizza base (" + food.getPizzaType().getName() + ") " + (food.calculateBasePrice()) + " €");
        printPizzaIngredients(food);
        delimiter();
        double pizzaAmount = food.calculatePrice();
        System.out.println("Amount: " + pizzaAmount + " €");
        System.out.println("Quantity " + food.getQuantity());
        delimiter();
    }

    public static  void printErrors(List<String> errors){
            for (String s : errors) {
                System.out.println(s);
            }
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
