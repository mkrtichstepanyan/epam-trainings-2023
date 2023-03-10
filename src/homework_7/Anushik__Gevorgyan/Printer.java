package homework_7.Anushik__Gevorgyan;


public class Printer {

    public static void printCheck(Order order) {
        printHeader();
        printOrderInfo(order);
        printPizzaInfo(order.getProduct());
        printOrderPrice(order);
        printFooter();

        // todo print logic goes here.


    }

    private static void printHeader() {
        System.out.println("*******************************");

    }

    private static void printOrderInfo(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Costumer: " + order.getCustomer().getNumber());
        System.out.println("**********************************");
    }

    private static void printPizzaInfo(Pizza[] pizzas) {
        for (int i = 0; i < pizzas.length; i++) {
            Pizza pizza = pizzas[i];
            if (pizza != null) {
                System.out.println("Name: " + pizza.getName());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Pizza Base: " + pizza.getPizzaType().getName() + "_" + pizza.getPizzaType().getPrice() + " $ ");
                printIngredients(pizza.ingredients());
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Quantity: " + pizza.getQuantity());
                System.out.println("Amount :" + pizza.calculatePrice() + "$");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

        }

    }

    private static void printOrderPrice(Order order) {
        System.out.println("Total amount: " + order.calculateOrderPrice() + "$");
    }

    private static void printFooter() {
        System.out.println("**************************");


    }


    private static void printIngredients(Ingredient[] ingredients) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient != null) {
                System.out.println(ingredient.getName() + "_" + ingredient.getPrice() + "$");
            }
        }
    }


}
