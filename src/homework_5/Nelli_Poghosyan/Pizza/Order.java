package homework_5.Nelli_Poghosyan.Pizza;

import java.time.LocalDateTime;
import java.util.Random;

public class Order {
    private static int customerNumber;

    public Order(int customerNumber) {
        this.customerNumber = customerNumber;

    }

    public LocalDateTime getLocalDateTime() {
        return java.time.LocalDateTime.now();
    }

    public void printCheck(PizzaList pizzaList) {
        double total = 0;
        double amount = 0;
        // Ingredients ing = new Ingredients();
        System.out.println("*******************************");
        System.out.println(getLocalDateTime());
        System.out.println("Order " + getOrderNumber());
        System.out.println("Client " + getCustomerNumber());
        for (Pizza p : pizzaList.getPizza()) {
            System.out.println("Name " + p.getPizzaName());
            System.out.println("------------------------");
            System.out.println("Pizza base(" + p.getPizzaType() + ") " + p.getBasePrice(p.getPizzaType()) + "$");
            if (p.getIngredient() == null) {
                return;
            } else {
                for (Ingredients ing : p.getIngredients()) {
                    amount = amount + ing.getIngredientPrice(ing.getIngredientName());
                    System.out.println(ing.getIngredientName() + " " + ing.getIngredientPrice(ing.getIngredientName()) + "$");
                }
            }
            System.out.println("-----------------------------");
            System.out.println("Amount " + amount + "$");
            System.out.println("Quantity  " + p.getQuantity());
            System.out.println("-----------------------------");
            total = total + amount * p.getQuantity();
        }
        System.out.println("Total amount: " + total);
        System.out.println("*****************************");
        System.out.println();
    }

    public static int getOrderNumber() {
        Random r = new Random();
        return r.nextInt(10000, 99999);
    }

    public static int getCustomerNumber() {
        return customerNumber;
    }
}
