package homework_7.Sofya_Ghazaryan.Pizza.printer;

import homework_7.Sofya_Ghazaryan.Pizza.model.*;

import java.time.format.DateTimeFormatter;

public class Printer {

    public void printCheck(Order order) {
        leadingLine();
        orderInfo(order);
        orderInfo(order);
        divorceLine();
        printPizzaInfo(order.getProducts());
        printDrinksInfo(order.getProducts());
        trainlingLine();
        printTotalAmount(order);
        trainlingLine();
    }


    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void orderInfo(Order order) {

        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getUser().getUserNumber());
        System.out.println("Order time: " + order.getOrderTime().format(DateTimeFormatter.ofPattern("d.MM.yyyy | hh:mm:ss")));
    }

    private static void divorceLine() {
        System.out.println("---------------------------------");
    }


    private static void printPizzaInfo(Product[] products) {
        for (Product product : products) {
            if (product instanceof Pizza) {
                Pizza pizza = (Pizza) product;
                System.out.println("Name: " + pizza.getName());
                divorceLine();
                System.out.println("Pizza Base ("
                        + pizza.getProductType().getName() + ") "
                        + product.getProductType().getPrice() + " $");
                printIngredients(pizza.getIngredients());
                divorceLine();
                System.out.println("Quantity: " + pizza.getQuantity());
                System.out.println("Amount: " + pizza.calculatePrice() + " $");
                divorceLine();
            }
        }
    }

    private static void printDrinksInfo(Product[] drinks) {
        trainlingLine();
        System.out.println("Drinks");
        divorceLine();
        for (Product drink : drinks) {
            if (drink instanceof Drink) {
                System.out.println(drink.getName() + " "
                        + drink.getQuantity() + " /"
                        + drink.getPrice() + " $/");
            }
        }
    }

    private static void printTotalAmount(Order order) {
        System.out.print("Total Amount: ");
        System.out.print(order.calculateOrderPrice());
        System.out.println(" $");
    }


    private static void trainlingLine() {
        System.out.println("********************");
    }

    private static void printIngredients(Ingredient[] ingredients) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient != null) {
                System.out.println(ingredient.getName() + " "
                        + ingredient.getPrice() + " $");
            }
        }
    }
}


