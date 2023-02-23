package homework_7.Varsik_Pijoyan;

import java.time.LocalTime;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        // todo print logic goes here.
        printLocalTime();
        orderInformation(order);
        pizzaInformation(order.getPizzas());
        drinkInformation(order.getDrinks());
        orderPrice(order);
        trainlingLine();

    }


    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void printLocalTime() {
        System.out.println("Local Time: " + LocalTime.now());
    }


    private static void orderInformation(Order order) {
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
        System.out.println("***********************");
    }

    private static void pizzaInformation(Pizza[] pizzas) {
        for (int i = 0; i < pizzas.length; i++) {
            Pizza pizza = pizzas[i];
            if (pizza != null) {
                System.out.println("Name: " + pizza.getName());
                printLines();
                System.out.println("Pizza Base: " + pizza.getPizzaType().getName() + " "
                        + pizza.getPizzaType().getPrice() + "$");
                for (int j = 0; j < pizza.getIngredients().length; j++) {
                    Ingredient[] ingredients = pizza.getIngredients();
                    if (ingredients[j] != null) {
                        System.out.println(ingredients[j].getName() + " " + ingredients[j].getPrice() + " €");
                    }
                }
                printLines();
                printPizzaQuantity(pizzas[i]);
                printPizzaAmount(pizzas[i]);
                printLines();
            }
        }
    }

    private static void drinkInformation(Drink[] drinks) {
        for (int i = 0; i < drinks.length; i++) {
            Drink drink = drinks[i];
            if (drink != null) {
                System.out.println("Name: " + drink.getName());
                printLines();
                printDrinkQuantity(drinks[i]);
                printDrinkAmount(drinks[i]);
                printLines();
            }
        }
    }


    private static void orderPrice(Order order) {
        System.out.println("Total amount: " + order.calculateOrderPrice() + "$");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }

    private static void printLines() {
        System.out.println("---------------------");
    }

    private static void printPizzaAmount(Pizza pizza) {
        System.out.println("Amount: " + pizza.calculatePrice() + "$");
    }

    private static void printPizzaQuantity(Pizza pizza) {
        System.out.println("Quantity: " + pizza.getQuantity());
    }

    private static void printDrinkAmount(Drink drink) {
        System.out.println("Amount: " + drink.calculatePrice() + " €");
    }

    private static void printDrinkQuantity(Drink drink) {
        System.out.println("Quantity: " + drink.getQuantity());
    }


    private static void pizzaIngredients(Ingredient[] ingredients) {
        for (Ingredient ingredient : ingredients) {
            if (ingredient != null) {
                System.out.println(ingredient.getName() + " " + ingredient.getPrice() + "$");
            }
        }
    }
}
