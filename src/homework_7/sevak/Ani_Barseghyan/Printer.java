package homework_7.sevak.Ani_Barseghyan;

public class Printer {
    private static double totalPrice = 0;

    public static void printCheck(Order order) {
        leadingLine();
        // todo print logic goes here.
        printOrderItem(order);
        printPizzas(order);

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
    }

    private static void printPizzas(Order order) {
        for (Pizza pizza : order.getPizzas()) {
            if (pizza == null) {
                return;
            }
            System.out.println("Name: " + pizza.getName());
            printDelimiter();
            System.out.print("Pizza Base (" + pizza.getPizzaTypeName() + ") ");
            System.out.println(pizza.getPizzaTypePrice());
            for (Ingredients ingredient : pizza.getIngredients()) {
                System.out.println(ingredient.getName() + " " + ingredient.getPrice());
            }
            printDelimiter();
            System.out.println("Amount " + pizza.calculatePrice());
            System.out.println("Quantity " + pizza.getQuantity());
            printDelimiter();
            totalPrice = pizza.calculatePrice() * pizza.getQuantity();
            System.out.println("Total amount " + totalPrice);
        }
    }
}
