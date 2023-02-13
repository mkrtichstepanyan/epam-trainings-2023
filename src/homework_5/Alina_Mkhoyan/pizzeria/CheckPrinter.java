package homework_5.Alina_Mkhoyan.pizzeria;


public class CheckPrinter {
    public static void checkPrint(Order order) {
        System.out.println("Order :" + order.getOrderNumber() + "\n" + "Client :" + order.getCustomer().getCustomerNumber());
        printSeparatorLine();
        for (OrderItem orderItem : order.getOrderItems()) {
            System.out.println(orderItem.toStringDescription());
            printSeparatorLine();
        }

        System.out.println("Total amount : " + order.calculateOrderPrice() + " $");
    }

    private static void printSeparatorLine() {
        System.out.println("-------------------------------------------");
    }

}
