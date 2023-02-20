package homework_7.Qnarik_Khachatryan;

public class Printer {

    public static void printCheck(Order order) {
        printHeader(order);
        printPizzas(order);
        printDrinks(order);
        printFooter(order);
    }


    private static void printHeader(Order order) {
        printBorder();
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
    }

    private static void printPizzas(Order order) {
        Pizza[] pizzas = order.getPizzas();
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzas[i] != null) {
                System.out.println("Name: " + pizzas[i].getName());
                printDelimiter();
                System.out.println("Pizza Base (" + pizzas[i].getPizzaType().getName() + ") " +
                        pizzas[i].getPizzaType().getPrice() + " €");
                for (int j = 0; j < pizzas[i].getIngredients().length; j++) {
                    Ingredient[] ingredients = pizzas[i].getIngredients();
                    if (ingredients[j] != null) {
                        System.out.println(ingredients[j].getName() + " " + ingredients[j].getPrice() + " €");
                    }
                }

                printDelimiter();
                printPizzaPrice(pizzas[i]);
                printPizzaQuantity(pizzas[i]);
                printDelimiter();
            }
        }
    }

    private static void printDrinks(Order order) {
        Drink[] drinks = order.getDrinks();
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i] != null) {
                System.out.println(drinks[i].getName() + " " + drinks[i].getDrinkType().getPrice() + " €");


                printDelimiter();
                printDrinkPrice(drinks[i]);
                printDrinkQuantity(drinks[i]);
                printDelimiter();
            }
        }
    }

    private static void printFooter(Order order) {
        printTotalAmount(order);
        printBorder();
    }

    private static void printPizzaPrice(Pizza pizza) {
        System.out.println("Amount: " + pizza.calculatePrice() + " €");
    }

    private static void printDrinkPrice(Drink drink) {
        System.out.println("Amount: " + drink.calculatePrice() + " €");
    }

    private static void printPizzaQuantity(Pizza pizza) {
        System.out.println("Quantity: " + pizza.getQuantity());
    }

    private static void printDrinkQuantity(Drink drink) {
        System.out.println("Quantity: " + drink.getQuantity());
    }


    private static void printTotalAmount(Order order) {
        System.out.println("Total amount: " + order.calculateOrderPrice() + " €");
    }

    private static void printBorder() {
        System.out.println("********************************");
    }

    private static void printDelimiter() {
        System.out.println("--------------------------------");
    }
}
