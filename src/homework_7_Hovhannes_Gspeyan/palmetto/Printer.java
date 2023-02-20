package homework_7_Hovhannes_Gspeyan.palmetto;

import homework_7_Hovhannes_Gspeyan.palmetto.menu.Ingredient;
import homework_7_Hovhannes_Gspeyan.palmetto.menu.MenuItem;
import homework_7_Hovhannes_Gspeyan.palmetto.menu.Pizza;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Printer {


    public static void printCheck(Order order,Pizza pizza) {
        // todo print logic goes here.
        leadingLine(order);
        printOrderInfo(order);
        printTotalInfo(order.getItems(),pizza);
        printOrderPrice(order);
        footerLine();

    }

    private static void leadingLine(Order order) {
        System.out.println("*******************************");
        System.out.println("Order Time: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm ")));
        order.printOrderAttributes();
        System.out.println("-------------------------------");
    }

    private static void printOrderInfo(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
        System.out.println("*****************************");
    }

    private static void printTotalInfo(MenuItem[] items, Pizza pizza) {
        for (MenuItem item : items) {
            if (item == null) {
                continue;
            }
            if(item instanceof Pizza){
                System.out.println("Name: " + item.getName());
                System.out.println("Quantity: " + item.getQuantity());
                System.out.println("Price: " + item.calculatePrice());
                printIngredients(pizza);
                System.out.println("--------------------------------");
            }
            System.out.println("Name: " + item.getName());
            System.out.println("Quantity: " + item.getQuantity());
            System.out.println("Price: " + item.calculatePrice());
            System.out.println("--------------------------------");
        }
    }
    private static void printIngredients(Pizza pizza) {
        Ingredient[] ingredients = pizza.getIngredients();
        for (Ingredient ingredient : ingredients) {
            if (ingredient != null) {
                System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " $");
            }
        }
    }

    private static void printOrderPrice(Order order) {
        System.out.println("Total Amount: " + order.calculateOrderAmount() + " $");
    }

    private static void footerLine() {
        System.out.println("********************");
    }
}
