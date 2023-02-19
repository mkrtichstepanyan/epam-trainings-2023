package homework_7.Radik_Manasyan;

public class Printer {

    public static void printCheck(OrderPizza order) {
        order.printOrderAttributes();

        leadingLine();

        orderClientPizzaInfo(order);
        bodyCheck(order);
        totalCoast(order);

        trainlingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void orderClientPizzaInfo(OrderPizza order) {
        System.out.println("Order: " + order.getOrderNumber() + "\nClient: " + order.getCustomer().getNumber());
    }

    private static void bodyCheck(OrderPizza order) {
        for (Pizza pizza : order.getPizzas()) {
            if (pizza != null) {

                System.out.println("Name: " + pizza.getName() + "\n-------------------------");
                System.out.println(pizza.getPizzaType().getName() + " " +
                        String.format("%.2f", pizza.getPizzaType().getPrice()) + " " +
                        order.getCustomer().getCurrency());
                for (Ingredient ingredient : pizza.getIngredients()) {
                    System.out.println(ingredient.getName() + " " + String.format("%.2f", ingredient.getPrice()) + " " +
                            order.getCustomer().getCurrency());
                }
                System.out.println("--------------------------------\n" +
                        "Amount: " + String.format("%.2f", pizza.calculatePrice()) + " " + order.getCustomer().getCurrency() +
                        "\nQuantity: " + pizza.getQuantity() +
                        "\n--------------------------------");
            }
        }
    }

    private static void totalCoast(OrderPizza order) {
        String totalAmount = String.format("%.2f", order.calculateOrderPrice());
        System.out.println("Total Amount: " + totalAmount + " " + order.getCustomer().getCurrency());
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }
}
