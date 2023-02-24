package homework_7.Ani_Barseghyan;

public class Printer {
    private static double totalPrice = 0;

    public static void printCheck(Order order) {
        leadingLine();
        // todo print logic goes here.
        printOrderItem(order);
        printPizzas(order);
//        printBeverages(order);
        trailingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trailingLine() {
        System.out.println("********************");
    }

    private static void printDelimiter() {
        System.out.println("---------------");
    }

    private static void printOrderItem(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomerNumber());
        printDelimiter();
    }

    private static void printPizzas(Order order) {
        for (Product product : order.getProducts()) {
            if (product == null) {
                continue;
            }
            System.out.println("Name: " + product.getName());
            System.out.println();
            System.out.print("Product " + product.getProductType().getName() + " ");
            System.out.println(product.getProductType().getPrice());
            if (product.getProductType().getType().equals("pizza")) {
                Ingredients[] ing = Pizza.getIngredients();
                for (Ingredients ingredient : ing) {
                    if (ingredient != null) {
                        System.out.println(ingredient.getName() + " " + ingredient.getPrice());
                    }
                }
            }
            printDelimiter();
            System.out.println("Amount " + product.calculatePrice());
            System.out.println("Quantity " + product.getQuantity());
            printDelimiter();
            totalPrice += product.calculatePrice() * product.getQuantity();
        }
        System.out.println("Total amount " + totalPrice);
    }
}
