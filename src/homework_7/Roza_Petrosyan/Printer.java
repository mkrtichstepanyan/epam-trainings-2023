package homework_7.Roza_Petrosyan;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        // todo print logic goes here.
        if (order.getPizzas() != null) {
            printHeader(order);
            printBody(order);
            printTotalAmount(order);
        }

        trainlingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }

    private static void printDelimiter() {
        System.out.println("--------------------------------");
    }

    private static void printHeader(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
    }

    private static void printBody(Order order) {
        for (Pizza pizza : order.getPizzas()) {
            if (pizza != null) {
                if (!pizza.isDuplicate(pizza.getIngredients()) && pizza.getMaxCount() < 7) {
                    printName(pizza);
                    printDelimiter();
                    printPizzaType(pizza);
                    printIngredients(pizza);
                    printDelimiter();
                    printAmountAndQuantity(pizza);
                    printDelimiter();
                }
            }
        }
        for (Drink drink : order.getDrinks()) {
            if (drink != null) {
                printDrink(drink);
                printDelimiter();
                printDrinkAmountAndQuantity(drink);
                printDelimiter();
            }
        }
    }

    private static void printName(Pizza pizza) {
        System.out.println("Name: " + pizza.getName());
    }

    private static void printPizzaType(Pizza pizza) {
        PizzaType pizzaType = pizza.getPizzaType();
        System.out.println(pizzaType.getName() + " " + pizzaType.getPrice() + " $");
    }

    private static void printAmountAndQuantity(Pizza pizza) {
        System.out.println("Amount: " + (pizza.calculatePrice() + " $"));
        System.out.println("Quantity: " + pizza.getQuantity());
    }

    private static void printDrinkAmountAndQuantity(Drink drink) {
        System.out.println("Amount: " + (drink.calculatePrice() + " $"));
        System.out.println("Quantity: " + drink.getQuantity());
    }

    private static void printIngredients(Pizza pizza) {
        Ingredient[] ingredients = pizza.getIngredients();

        if (ingredients != null) {
            for (Ingredient ingredient : ingredients) {
                if (ingredient != null) {
                    System.out.println(ingredient.getName() + " " + ingredient.getPrice() + " $");
                }
            }
        }
    }

    private static void printDrink(Drink drink) {
        DrinkType drinkPizzaType = drink.getDrinkType();
        System.out.println(drink.getName() + " " + drinkPizzaType.getPrice() + " $");
    }

    private static void printTotalAmount(Order order) {
        System.out.println("Total amount: " + (order.calculateOrderPrice() + " $"));
    }
}
