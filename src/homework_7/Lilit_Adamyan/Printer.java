package homework_7.Lilit_Adamyan;

import homework_5.Lilit_Adamyan.Pizza.Pizza;

import java.util.List;

public class Printer {


    public static void printCheck(Order order) {
        System.out.println("*************************");
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getName());
      //  printPizza(order.getPizzas());

    }
    public static void printPizza(Pizza[]pizzas) {

        double totalAmount = 0;
        for (Pizza pizza : pizzas) {
            System.out.println("Name: " + pizza.getName());
            System.out.println("____________________________");

            double pizzaAmount = 0;
            for (String ingredient : pizza.getIngredients()) {
                double ingredientPrice = 0;
                System.out.println(ingredient + " " + ingredientPrice + " €");
                pizzaAmount += ingredientPrice;
            }
            pizzaAmount += (pizza.getType().equals("Pizza Base (Calzone)") ? 1.5 : 1);
            printLine();
            System.out.println("Amount: " + pizzaAmount + " €");
            System.out.println("Quantity: " + pizza.getQuantity());
            printLine();
            totalAmount += pizzaAmount * pizza.getQuantity();

        }
        System.out.println("Total amount: " + totalAmount + " €");
        leadingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }
    private static void printLine(){
        System.out.println("______________________");
    }
}
