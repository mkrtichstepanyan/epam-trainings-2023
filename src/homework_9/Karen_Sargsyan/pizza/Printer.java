package homework_9.Karen_Sargsyan.pizza;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Customer: " + order.getCustomer().getNumber());
        for (int i = 0; i < order.getItems().length; i++) {
            Item item = order.getItems()[i];
            if (item != null) {
                System.out.println("Product: " + item.getProduct());
                System.out.println("Name: " + item.getName());
                deliminator();
                System.out.println(item.getBasicType().getName() + " " +
                        item.getBasicType().getPrice() + "$");
                if (item instanceof Pizza) {
                    for (int j = 0; j < ((Pizza) item).getIngredients().length; j++) {
                        if (((Pizza) item).getIngredients()[j] != null) {
                            System.out.println(((Pizza) item).getIngredients()[j].getName() + " " +
                                    ((Pizza) item).getIngredients()[j].getPrice() + "$");
                        }
                    }
                }
                if (item instanceof Barbecue) {
                    for (int j = 0; j < ((Barbecue) item).getIngredients().length; j++) {
                        if (((Barbecue) item).getIngredients()[j] != null) {
                            System.out.println(((Barbecue) item).getIngredients()[j].getName() + " " +
                                    ((Barbecue) item).getIngredients()[j].getPrice() + "$");
                        }
                    }
                }
                deliminator();
                System.out.println("Amount: " + item.calculatePrice() + "$");
                System.out.println("Quantity: " + item.getQuantity());
                deliminator();
            }
        }
        System.out.println("Total Amount: " + order.calculateOrderPrice(order.getItems()));
        trainingLine();
    }

    private static void deliminator() {
        System.out.println("-----------------");
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trainingLine() {
        System.out.println("********************");
    }

}
