package homework_7.TatevKocharyan;


public class Printer {
    public static void printCheck(Order order) {

        leadingLine();
        orderNumber(order);
        clientNumber(order);
        orderAttributes(order.getPizzas());
        trailingLine();
        // todo print logic goes here.+
    }

    private static void clientNumber(Order order) {
        System.out.println("Client: " + order.getCustomer().getCustomerNumber());
    }

    private static void orderNumber(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
    }

    private static void orderAttributes(Pizza[] pizzas) {
        double orderPrice = 0.0;
        int quantity = 0;
        double totalAmount = 0;
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzas[i] != null) {
                System.out.println();
                System.out.println("Name: " + pizzas[i].getName());
                delimiter();
                System.out.println("Pizza Base" + "(" + pizzas[i].getPizzaType().getName() + ") "
                        + pizzas[i].getPizzaType().getPrice() + "€");
                Ingredient[] ingredients = pizzas[i].getIngredients();
                for (int j = 0; j < ingredients.length; j++) {
                    System.out.println(ingredients[j].getName() + "   " + ingredients[j].getPrice() + "€");

                }
                delimiter();
                orderPrice = pizzas[i].calculatePrice();
                quantity = pizzas[i].getQuantity();
                System.out.println("Amount: " + orderPrice + "€");
                System.out.println("Quantity: " + quantity);
                delimiter();
                totalAmount = totalAmount + orderPrice * quantity;
            }
        }
        System.out.println("Total amount:" + totalAmount + "€");
    }

    private static void delimiter() {
        System.out.println("-----------------------");
    }

    private static void leadingLine() {
        System.out.println("*************************");
    }

    private static void trailingLine() {
        System.out.println("*************************");
    }
}