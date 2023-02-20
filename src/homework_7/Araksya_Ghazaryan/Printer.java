package homework_7.Araksya_Ghazaryan;

public class Printer {

    public static void printCheck(Order order) {
        printLeadingLine();
        printerForOrder(order);
        printForPizza(order.getPizzas());
        printTrainlingLine();
    }

    private static void printLeadingLine() {

        System.out.println("*****************************");
    }

    private static void printerForOrder(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Customer: " + order.getCustomer().getNumber());
        System.out.println("*****************************");
    }

    private static void printForPizza(Pizza[] pizzas) {
        for (int i = 0; i < pizzas.length; i++) {
            Pizza pizza = pizzas[i];
            if (pizza != null) {
                System.out.println("Name: " + pizza.getName());
                System.out.println("------------------------");
                System.out.println("Pizza Base: " + pizza.getPizzaType().getName() + " "
                        + pizza.getPizzaType().getPrice() + " $");
                printIngredients(pizza.getIngredients());
                System.out.println("------------------------");
                System.out.println("Quantity: " + pizza.getQuantity());
                System.out.println("Amount: " + pizza.calculatePrice() + " $");
                System.out.println("------------------------");
            }
        }
    }

    private static void printTrainlingLine() {
        System.out.println("******************************");
    }

    private static void printIngredients(Ingredient[] ingredients) {

        for (Ingredient ingredient : ingredients) {
            if (ingredient != null) {
                System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " $");
            }
        }
    }
}
