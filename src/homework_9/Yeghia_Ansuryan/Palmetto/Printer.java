package homework_9.Yeghia_Ansuryan.Palmetto;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Customer: " + order.getCustomer().getNumber());
        System.out.println("Phone Number: " + order.getCustomer().getPhoneNumber());
        for (int j = 0; j < order.getProducts().length; j++) {
            Product product = order.getProducts()[j];
            if (product != null) {
                System.out.println("Product: " + product.getProduct());
                System.out.println("Name:  " + product.getName());
                deliminator();
                System.out.println(product.getBasicType().getName() + " " +
                        product.getBasicType().getPrice() + "$");
                if (product instanceof Pizza) {
                    for (int i = 0; i < ((Pizza) product).getIngredients().length; i++) {
                        System.out.println(((Pizza) product).getIngredients()[i].getName() + " " +
                                ((Pizza) product).getIngredients()[i].getPrice() + "$");
                    }
                }
                deliminator();
                System.out.println("Amount: " + product.calculatePrice());
                System.out.println("Quantity: " + product.getQuantity());
                deliminator();
            }
        }
        System.out.println("Total Amount: " + order.calculateOrderPrice(order.getProducts()));
        trainlingLine();
    }

    private static void deliminator() {
        System.out.println("----------------------");
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }
}
