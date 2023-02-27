package homework_9.Ani_Kovalenko.Pizza_Enum_Interface;
public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Customer: " + order.getCustomer().getNumber());
        for (int j = 0; j < order.getItems().length; j++) {
            Item item = order.getItems()[j];
            if (item != null) {
                System.out.println("Product: " + item.getProduct());
                System.out.println("Name: " + item.getName());
                deliminator();
                System.out.println(item.getItemType().getName() + " " +
                        item.getItemType().getPrice() + "$");
                if (item instanceof Pizza) {
                    for (int i = 0; i < ((Pizza) item).getIngredients().length; i++) {
                        if (((Pizza) item).getIngredients()[i] != null) {
                            System.out.println(((Pizza) item).getIngredients()[i].getName() + " " +
                                    ((Pizza) item).getIngredients()[i].getPrice() + "$");
                        }
                    }
                }
                if (item instanceof Burger) {
                    for (int i = 0; i < ((Burger) item).getIngredients().length; i++) {
                        if (((Burger) item).getIngredients()[i] != null) {
                            System.out.println(((Burger) item).getIngredients()[i].getName() + " " +
                                    ((Burger) item).getIngredients()[i].getPrice() + "$");
                        }
                    }
                }
                deliminator();
                System.out.println("Amount: " + item.calculatePrice());
                System.out.println("Quantity: " + item.getQuantity());
                deliminator();
            }
        }
        System.out.println("Total Amount: " + order.calculateOrderPrice(order.getItems()));
        trainlingLine();
    }

    private static void deliminator() {
        System.out.println("-------------------------");
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }
}
