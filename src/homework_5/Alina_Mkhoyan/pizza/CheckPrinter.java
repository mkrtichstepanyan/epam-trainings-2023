package homework_5.Alina_Mkhoyan.pizza;


public class CheckPrinter {
    public static void printCheck(Order order) {
        double totalAmount = 0;
        System.out.print("*********************************" + "\n" + "Order Time: " + order.getTime()
                + "\n" + "Order: " + Order.getOrderId() + "\n" + "Client: " +
                Order.getCustomerId() + "\n");
        for (int i = 0; i < order.getItems().size(); i++) {
            double amount = 0;
            System.out.println("Name: " + order.getItems().get(i).getName() + "\n" + "---------------------" + "\n" +
                    "Pizza Base (Calzone)" + " " + order.getItems().get(i).getType().getPrice() + " $");
            for (int j = 0; j < order.getItems().get(i).getIngredients().size(); j++) {
                System.out.println(order.getItems().get(i).getIngredients().get(j).getName() +
                        " " + order.getItems().get(i).getIngredients().get(j).getPrice() + " $");
                amount += order.getItems().get(i).getIngredients().get(j).getPrice();
            }
            amount += order.getItems().get(i).getType().getPrice();
            System.out.println("---------------------" + "\n" + "Amount: " + amount + " $" + "\n" + "Quantity: " +
                    order.getItems().get(i).getQuantity() + "\n" + "---------------------");
            totalAmount += order.getItems().get(i).getQuantity() * amount;
        }
        System.out.print("Total Amount: " + totalAmount + " $" + "\n"
                + "*********************************");
    }
}