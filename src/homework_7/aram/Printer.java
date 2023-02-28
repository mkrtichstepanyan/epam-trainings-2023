package homework_7.aram;
import static homework_7.aram.Pizza.printPizzaIngredients;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        // todo print logic goes here.
        printOrderInfo( order);
        printDelimiter();
        System.out.println("Amount: " + order.calculateOrderPrice() + " $");
        trainlingLine();

        }

    public static  void printOrderInfo(Order order){
        Product[] products = order.getProducts();
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Customer: " + order.getCustomer().getName());
        for (Product product : products) {
            if (product != null) {
                if (product.productType.equals(ProductType.PIZZA)) {
                    printPizza((Pizza) product);
                } else if (product.productType.equals(ProductType.DRINK)) {
                    printDrink((Drink) product);
                }
            }
        }
    }
    private static void printDrink(Drink product) {
        System.out.println("Name: " + product.getName());
        printDelimiter();
        System.out.println("Food type (" + product.getName() + ") ");
        printDelimiter();
        double drinksAmount = product.calculatePrice();
        System.out.println("Amount: " + drinksAmount + " €");
        System.out.println("Quantity " + product.getQuantity());
        printDelimiter();
    }
    private static void printPizza(Pizza product) {
        System.out.println("Name: " + product.getName());
        printDelimiter();
        System.out.println("Pizza base (" + product.getPizzaType().getName() + ") " + (product.calculatePrice()) + " €");
        printPizzaIngredients(product);
        printDelimiter();
        double pizzaAmount = product.calculatePrice();
        System.out.println("Amount: " + pizzaAmount + " €");
        System.out.println("Quantity " + product.getQuantity());
        printDelimiter();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }

    private static void printDelimiter() {
        System.out.println("---------------------------");
    }
}

