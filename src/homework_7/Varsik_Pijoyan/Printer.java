package homework_7.Varsik_Pijoyan;

import java.time.LocalTime;

public class Printer {

    public static void printCheck(Order order) {
        leadingLine();
        // todo print logic goes here.
        printLocalTime();
        orderInformation(order);
        pizzaInformation(order.getPizzas());
        orderPrice(order);
        trainlingLine();

    }



    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void printLocalTime(){
        System.out.println("Local Time: " + LocalTime.now());
    }


    private static void orderInformation(Order order){
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
        System.out.println("***********************");
    }

    private static void pizzaInformation(Pizza[] pizzas){
        for (int i = 0; i< pizzas.length; i++) {
            Pizza pizza = pizzas[i];
            if (pizza != null){
                System.out.println("Name: " + pizza.getName());
                System.out.println("--------------------------");
                System.out.println("Pizza Base: " + pizza.getPizzaType().getName() + " "
                        + pizza.getPizzaType().getPrice() + "$");
                pizzaIngredients(pizza.getIngredients());
                System.out.println("----------------------------");
                System.out.println("Quantity: " + pizza.getQuantity());
                System.out.println("Amount: " + pizza.calculatePrice() + "$");
                System.out.println("-------------------------------");
            }
        }
    }


    private static void orderPrice(Order order){
        System.out.println("Total amount: " + order.calculateOrderPrice() + "$");
    }

    private static void trainlingLine() {
        System.out.println("********************");
    }

    private static void pizzaIngredients(Ingredient[] ingredients){
        for (Ingredient ingredient : ingredients) {
            if(ingredient != null){
                System.out.println(ingredient.getName() + " " + ingredient.getPrice() + "$");
            }
        }
    }
}
