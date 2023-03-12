package homework_7.Anush_Ananyan;

import java.sql.SQLOutput;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
        for (Product product : order.getProducts()) {
            if (product != null) {
                System.out.println();
                System.out.println("Name: " + product.getName());
                printDelimiter();
                if (product instanceof Pizza) {
                    System.out.println("Pizza base " + product.getProductType().getName() + " " + product.getProductType().getPrice() + "$");
                    printIngredients(((Pizza) product).getIngredients());
                } else if (product instanceof Salad) {
                    System.out.println("Salad type " + product.getProductType().getName() + " "+ product.getProductType().getPrice() + " $");
                }
                System.out.println("Amount: " + product.calculatePrice() + "$");
                System.out.println("Quantity: " + product.getQuantity());
            }
        }
        printDelimiter();
        System.out.println("Total amount: " + order.calculateOrderPrice() + "$");

        trainlingLine();

    }

    public static void printIngredients(Ingredient[] ingredients) {
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getName() + " " + ingredient.getPrice() + "$");
        }
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }

    private static void printDelimiter() {
        System.out.println("---------------------");
    }
}

