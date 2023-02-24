package homework_7.rafik_pahlevanyan.ordering_system.util;


import homework_7.rafik_pahlevanyan.ordering_system.drink.Juice;
import homework_7.rafik_pahlevanyan.ordering_system.model.Order;
import homework_7.rafik_pahlevanyan.ordering_system.pizza.Ingredient;
import homework_7.rafik_pahlevanyan.ordering_system.pizza.Pizza;
import homework_7.rafik_pahlevanyan.ordering_system.product.Product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Printer {
    public static void printCheck(Order order) {
        printHeader();
        printOrderInfo(order);
        printPizzaInfo(order.getProducts());
        printDrinksInfo(order.getProducts());
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
    public static void printPizzaInfo(Product[] products) {
        for (Product product : products) {
            if (product instanceof Pizza) {
                Pizza pizza = (Pizza) product;
                System.out.println("Name: " + pizza.getName());
                System.out.println("------------------------");
                System.out.println("Pizza Base: " + pizza.getProductType().getName() + " "
                        + pizza.getProductType().price + " $");
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
    private static void printDrinksInfo(Product[] juices) {
        System.out.println("Drinks");
        System.out.println("------------------------------");
        for (Product juice : juices) {
            if (juice instanceof Juice) {
                System.out.println(juice.getName() + " : " + juice.getQuantity() + " * " + juice.getPrice() + " $");
            }
        }
    }

}