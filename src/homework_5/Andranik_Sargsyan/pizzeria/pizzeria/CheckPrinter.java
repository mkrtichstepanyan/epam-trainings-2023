package homework_5.Andranik_Sargsyan.pizzeria.pizzeria;

public class CheckPrinter {
    public static void checkPrint(Order order) {
        System.out.println("***************************");
        System.out.println("Order :" + order.getOrderNumber() + "\n" + "Client :" +
                +order.getCustomer().getClientNumber());
        System.out.println("*************************");
        for (OrderItem orderItem : order.getOrderItems()) {
            System.out.println(orderItem.toStringDescription());
            System.out.println("*************************");
        }

        System.out.println("Amount: " + order.calculateOrderPrice() + " $");
        System.out.println("Quantity: " + order.getOrderNumber());
        System.out.println("_________________________");
        System.out.println("Total amount: " + order.calculateOrderPrice() + " $");
        System.out.println("*************************");
    }
}
