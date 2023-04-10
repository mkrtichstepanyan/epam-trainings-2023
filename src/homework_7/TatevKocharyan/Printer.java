package homework_7.TatevKocharyan;


public class Printer {
    public static void printCheck(Order order) {

        leadingLine();
        orderNumber(order);
        clientNumber(order);
        orderAttributes(order.getProducts());
        trailingLine();
        // todo print logic goes here.+
    }

    private static void clientNumber(Order order) {
        System.out.println("Client: " + order.getCustomer().getCustomerNumber());
    }

    private static void orderNumber(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
    }

    private static void orderAttributes(Product[] products) {
        double orderPrice = 0.0;
        int quantity = 0;
        double totalAmount = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof Pizza) {
                Pizza pizza = (Pizza) products[i];
                if (pizza != null) {
                    System.out.println();
                    System.out.println("Name: " + products[i].getName());
                    delimiter();
                    System.out.println("Pizza Base" + "(" + pizza.getProductType().getName() + ") "
                            + pizza.getProductType().getPrice() + "€");
                    Ingredient[] ingredients = pizza.getIngredients();
                    for (int j = 0; j < ingredients.length; j++) {
                        System.out.println(ingredients[j].getName() + "   " + ingredients[j].getPrice() + "€");

                    }
                    delimiter();
                    orderPrice = products[i].calculatePrice();
                    quantity = products[i].getQuantity();
                    System.out.println("Amount: " + orderPrice + "€");
                    System.out.println("Quantity: " + quantity);
                    delimiter();
                    totalAmount = totalAmount + orderPrice * quantity;
                }
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