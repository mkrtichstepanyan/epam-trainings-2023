package homework_7.Anna_Manukyan;


import static homework_7.Anna_Manukyan.Pizza.printPizzaIngredients;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
        double totalSum = 0;
        for (Pizza pizza : order.getPizzas()) {
            if (pizza != null){
                System.out.println("Name: " + pizza.getName());
                delimiter();
                System.out.println("Pizza base (" + pizza.getPizzaType().getName() + ") " + (pizza.calculateBasePrice()) + " €");
                printPizzaIngredients(pizza);
                delimiter();
                double pizzaAmount = pizza.calculatePrice();
                System.out.println("Amount: " + pizzaAmount + " €");
                System.out.println("Quantity " + pizza.getQuantity());
                delimiter();
                totalSum += pizzaAmount * pizza.getQuantity();
            }
        }
        delimiter();
        System.out.println("Total amount " + totalSum + " €");
        delimiter();
        System.out.println("Order time " + order.orderTime.getHour() + ":" + order.orderTime.getMinute());
        trailingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trailingLine() {
        System.out.println("********************");
    }

    private static void delimiter() {
        System.out.println("--------------------------");
    }


}
