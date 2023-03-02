package homework_7.Vladimir_Vanyan;

public class Printer {

    private int index = 1;

    public void printOrderAttributes(Order order) {

        System.out.println( "Order: " + order.getOrderNumber() + "\n" +
                        "Customer number: " + order.getCustomer().getNumber() + "\n" +
                        "All Quantity Order: " + order.getProducts().length);
        System.out.println("------------------------------");
        for (Product product : order.getProducts()) {
            if (product != null) {
                System.out.print(
                        "Product name: " + product.getName() + " Price: " + product.getPrice() + " quantity: " + product.getQuantity() + "\n"
                );
            }

        }
    }

    public void printCheck(Order order) {

        printStartLine();
        printOrderInfo(order);
        printProductInfo(order.getProducts());
        printTotalPriceOfOrder(order);
        printFinishLine();

    }

    private void printStartLine() {
        System.out.println("**************************************\n");
    }

    private void printOrderInfo(Order order) {
        System.out.println(
                "Order: " + order.getOrderNumber() + "\n" +
                        "Client: " + order.getCustomer().getNumber());
    }

    private void printProductInfo(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                break;
            }
            System.out.print((index++) + ". ");
            if (products[i].getClass() == Pizza.class) {
                printPizzaInfo((Pizza) products[i]);
            } else {
                System.out.println(
                        "Name: " + products[i].getName() + "\n" +
                                "---------------------------" + "\n" +
                                "Drink base: " + products[i].getName() + " " + products[i].getPrice() + "\n" +
                                "Quantity: " + products[i].getQuantity() + "\n" +
                                "---------------------------");
            }
        }
    }

    private void printTotalPriceOfOrder(Order order) {
        System.out.println("Total price: " + order.calculateTotalPriceOfOrder());
    }

    private void printFinishLine() {
        System.out.println("**************************************\n\n");
    }

    private void printPizzaInfo(Pizza pizza) {
        System.out.println(
                "Name: " + pizza.getName() + "\n" +
                        "---------------------------" + "\n" +
                        "Pizza base: " + pizza.getPizzaType().getName() + " " +
                        pizza.getPizzaType().getPrice());

        printIngredients(pizza.getIngredients());
        System.out.println(
                "---------------------------" + "\n" +
                        "Amount: " + pizza.getPrice() + "\n" +
                        "Quantity: " + pizza.getQuantity() + "\n" +
                        "---------------------------");

    }

    private void printIngredients(Ingredient[] ingredients) {
        for (Ingredient i : ingredients) {
            System.out.println(i.getName() + " " + i.getPrice());
        }
    }
}
