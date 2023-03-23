package homework_10.Zara_Avetyan.pizza;

public class Printer {
    public static void printCheck(Order order) {
        loadingLine();
        orderNumber(order);
        customerName(order.getCustomer());
        pizzaElements(order.getPizzas(), order);
        trainlingLine();
    }

    private static void loadingLine() {
        System.out.println("********************");
    }

    private static void orderNumber(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
    }

    private static void customerName(Customer customer) {
        System.out.println("Client: " + customer.getName());
    }

    private static void pizzaElements(Pizza pizzas[], Order order) {
        for (Pizza pizza : pizzas) {
            try{
                System.out.println("Name: " + pizza.getName());
                System.out.println("--------------------------------");
                System.out.println("Pizza Base (" + pizza.getPizzaType().getName() + ") " + pizza.getPizzaType().getPrice() + "€");
                for (Ingredient ingredient : pizza.getIngredients()) {
                    System.out.println(ingredient.getName() + " " + ingredient.getPrice() + "€");
                }
                System.out.println("--------------------------------");
                System.out.println("Amount: " + pizza.calculatePrice() + "€");
                System.out.println("Quantity: " + pizza.getQuantity());
                System.out.println("--------------------------------");

            }catch (NullPointerException e){
            }
        }
        System.out.println("Total amount: " + order.calculateOrderPrice() + "€");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }
}
