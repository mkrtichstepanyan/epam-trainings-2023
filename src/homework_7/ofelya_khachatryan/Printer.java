package homework_7.ofelya_khachatryan;

public class Printer {
    public static void printCheck(Order order) {
        leadingLine();
        // todo print logic goes here.

        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getOrderNumber());
        for (Pizza pizza : order.getPizzas()) {
            if (pizza != null) {
                System.out.println("Name: " + pizza.getName());
                printDelimiter();
                for (Ingredient ingredient : pizza.getIngredients()) {
                    System.out.println(ingredient.getName() + " " + ingredient.getPrice() + "€");
                    System.out.println("Quantity: " + pizza.getQuantity());
                }
            }
        }
        printDelimiter();
        System.out.println("Total Amount: " + order.calculateOrderPrice() + "€");
        trainlingLine();
    }

    private static void printDelimiter() {
        System.out.println("---------------------");
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }
}
