package homework_7.aram;


public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        // todo print logic goes here.
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomerName());
        for (Pizza pizza : order.getPizzas()) {
            System.out.println("Name: " + pizza.getName());
            System.out.println("Pizza Base ( " + pizza.getPizzaTypeName() + " ) " + pizza.getPizzaTypePrice());
            for (Ingredient ingredient : pizza.getIngredients()) {
                System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " $");
            }

            printDelimiter();
            System.out.println("Amount: " + pizza.calculatePrice() + " $");
            System.out.println("Quantity: " + pizza.getQuantity());
            printDelimiter();
        }
        System.out.println("Total amount: " + order.calculateOrderPrice() + " $");

        trainlingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }

    private static void printDelimiter() {
        System.out.println("---------------------------");
    }
}

