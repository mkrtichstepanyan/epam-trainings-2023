package homework_7.Roza_Petrosyan.printer;

import homework_7.Roza_Petrosyan.Ingredient;
import homework_7.Roza_Petrosyan.Order;
import homework_7.Roza_Petrosyan.productType.*;
import homework_7.Roza_Petrosyan.product.*;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        // todo print logic goes here.
        if (order.getProducts() != null) {
            printHeader(order);
            printBody(order);
            printTotalAmount(order);
        }

        trainlingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }

    private static void printDelimiter() {
        System.out.println("--------------------------------");
    }

    private static void printHeader(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
    }

    private static void printBody(Order order) {
        for (Product product : order.getProducts()) {
            if (product != null) {
                if (product.getClass().getSimpleName().equals("Pizza")) {
                    Pizza pizza = (Pizza) product;
                    if(!pizza.isDuplicate(pizza.getIngredients()) && pizza.getMaxCount() < 7) {
                        printName(product);
                        printDelimiter();
                        printProductType(product);
                        printIngredients(product);
                        printDelimiter();
                        printAmountAndQuantity(product);
                        printDelimiter();
                    }
                } else {
                    printName(product);
                    printDelimiter();
                    printProductType(product);
                    printDelimiter();
                    printAmountAndQuantity(product);
                    printDelimiter();
                }
            }
        }
    }

    private static void printName(Product product) {
        System.out.println("Name: " + product.getName());
    }

    private static void printProductType(Product product) {
        if (product.getClass().getSimpleName().equals("Pizza")) {
            Pizza pizza = (Pizza) product;
            ProductType productType = pizza.getProductType();
            if (productType != null) {
                System.out.println(productType.getName() + " " + productType.getPrice() + " $");
            }
        } else if (product.getClass().getSimpleName().equals("Drink")) {
            Drink drink = (Drink) product;
            ProductType productType = drink.getProductType();
            if (productType != null) {
                System.out.println(productType.getName() + " " + productType.getPrice() + " $");
            }
        }
    }

    private static void printAmountAndQuantity(Product product) {
        System.out.println("Amount: " + (product.calculatePrice() + " $"));
        System.out.println("Quantity: " + product.getQuantity());
    }


    private static void printIngredients(Product product) {
        if (product.getClass().getSimpleName().equals("Pizza")) {
            Pizza pizza = (Pizza) product;
            Ingredient[] ingredients = pizza.getIngredients();

            if (ingredients != null) {
                for (Ingredient ingredient : ingredients) {
                    if (ingredient != null) {
                        System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " $");
                    }
                }
            }
        }
    }

    private static void printTotalAmount(Order order) {
        System.out.println("Total amount: " + (order.calculateOrderPrice() + " $"));
    }
}
