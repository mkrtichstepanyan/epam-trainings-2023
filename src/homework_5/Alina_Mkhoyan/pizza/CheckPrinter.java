package homework_5.Alina_Mkhoyan.pizza;


import java.util.List;

public class CheckPrinter {
    public static void printCheck(Order order) {
        List<Pizza> pizza = order.getItems();
        int sumQuantity = 0;
        for (Pizza item : pizza) {
            sumQuantity += item.getQuantity();
        }
        if (sumQuantity > 10) {
            System.out.println("Quantity can't be more than 10");
        } else {
            double totalAmount = 0;
            System.out.print("*********************************" + "\n" + "Order Time: " + order.getTime()
                    + "\n" + "Order: " + Order.getOrderId() + "\n" + "Client: " +
                    Order.getCustomerId() + "\n");
            for (int i = 0; i < pizza.size(); i++) {
                double amount = 0;
                System.out.println("Name: " + pizza.get(i).getName() +
                        "\n" + "---------------------");
                System.out.println("Pizza Base (" + pizza.get(i).getType().getName() + ") "
                        + pizza.get(i).getType().getPrice() + " $");
                for (int j = 0; j < pizza.get(i).getIngredients().size(); j++) {
                    System.out.println(pizza.get(i).getIngredients().get(j).getName() +
                            " " + pizza.get(i).getIngredients().get(j).getPrice() + " $");
                    amount += pizza.get(i).getIngredients().get(j).getPrice();
                }
                amount += pizza.get(i).getType().getPrice();
                System.out.println("---------------------" + "\n" + "Amount: " + amount + " $");
                System.out.println("Quantity: " + pizza.get(i).getQuantity() +
                        "\n" + "---------------------");
                totalAmount += pizza.get(i).getQuantity() * amount;
            }
            System.out.print("Total Amount: " + totalAmount + " $" + "\n"
                    + "*********************************");
        }
    }
}