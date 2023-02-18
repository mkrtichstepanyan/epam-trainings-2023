package homework_5.garik_gharibyan.pizza;

public class Printer {


    private void printStartLine() {
        System.out.println("**************************************");
    }

    private void printOrderInfo(Order order) {
        System.out.println(
                "Order: " + order.getOrderNumber() + "\n" +
                        "Client: " + order.getCustomer().getNumber());
    }

    private void printPizzaInfo(Order order) {
        for (Pizza pizza : order.getPizzas()) {
            System.out.println(
                    "Name: " + pizza.getName() + "\n" +
                            "---------------------------" + "\n" +
                            "Pizza base: " + pizza.getPizzaType().getPizzaTypeName() + " " +
                            pizza.getPizzaType().getPizzaTypePrice());

            printIngredients(pizza.getIngredients());
            System.out.println(
                    "---------------------------" + "\n" +
                            "Amount: " + pizza.pizzaAmount() + "\n" +
                            "Quantity: " + pizza.getQuantity() + "\n" +
                            "---------------------------");
        }
    }

    private void printTotalAmount(Order order) {
        System.out.println("Total Amount: " + order.getTotalAmount());
    }

    private void printFinishLine() {
        System.out.println("**************************************\n\n");
    }

    private void printIngredients(Ingredient[] ingredients) {
        for (Ingredient i : ingredients) {
            System.out.println(i.getName() + " " + i.getPrice());
        }
    }

    public void printCheck(Order order) {

        printStartLine();
        printOrderInfo(order);
        printPizzaInfo(order);
        printTotalAmount(order);
        printFinishLine();

    }
}
