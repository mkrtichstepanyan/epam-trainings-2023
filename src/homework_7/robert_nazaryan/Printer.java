package homework_7.robert_nazaryan;

public class Printer {

    public static void printCheck(Order order) {
        order.printOrderAttributes();
        leadingLine();
        printOrderInfo(order);
        printDrinkInfo(order.getDrinks());
        printPizzaInfo(order.getPizzas());
        printDelimiter();
        printTotalPrice(order);
        trainlingLine();
    }

    private static void printOrderInfo(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
        System.out.println("Name: " + order.getCustomer().getName());
    }

    private static void printDrinkInfo(Drink[] drinks) {
        for (Drink drink : drinks) {
            if (drink != null) {
                printDelimiter();
                System.out.println("Drink: " + drink.getName() + " " + drink.getPrice() + " $");
                System.out.println("Quantity: " + drink.getQuantity());
            }
        }
    }

    private static void printPizzaInfo(Pizza[] pizzas) {
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                printDelimiter();
                System.out.println("Pizza Name: " + pizza.getName());
                printDelimiter();
                System.out.println("Pizza Base: " + pizza.getPizzaType().getName() + " "
                        + pizza.getPizzaType().getPrice() + " $");
                printIngredientsInfo(pizza.getIngredients());
                System.out.println("Quantity: " + pizza.getQuantity());
                System.out.println("Amount: " + pizza.calculatePrice() + " $");
            }
        }
    }

    private static void printTotalPrice(Order order) {
        System.out.println("Total amount: " + order.calculateOrderPrice() + " $");
    }

    private static void printIngredientsInfo(Ingredient[] ingredients) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient != null) {
                System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " $");
            }
        }
    }


    private static void printDelimiter() {
        System.out.println("--------------------");
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }
}
