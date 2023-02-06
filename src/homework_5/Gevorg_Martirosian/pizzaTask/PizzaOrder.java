package homework_5.Gevorg_Martirosian.pizzaTask;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//class for making order
public class PizzaOrder {
    private static int staticID = 10000;
    private final int orderID;
    private final String customerName;
    private final Pizza[] pizza;
    private LocalDateTime orderTime;
    String formatDateTime;

    //method for making order
    public PizzaOrder(String customerName, Pizza... pizza) {
        orderID = PizzaOrder.staticID++;
        this.customerName = customerName + " " + (int)(Math.random()*10000);
        this.pizza = pizza;
        for (int i = 0; i < pizza.length; i++) {
            if (pizza[i].getPizzaName().length() < 4 || pizza[i].getPizzaName().length() > 20) {
                pizza[i].setPizzaName(customerName + "_" + i);
            }
        }
        orderTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        formatDateTime = orderTime.format(format);
    }

    //method for printing the check of order
    public void printCheck() {
        double totalAmount = 0;
        double currentAmount = 0;
        System.out.println("order ID: " + orderID);
        System.out.println("client: " + customerName);
        System.out.println("order time: " + formatDateTime);
        for (Pizza value : pizza) {
            System.out.println("pizza name: " + value.getPizzaName());
            System.out.println("--------------------------");
            switch (value.getPizzaType().toUpperCase()) {
                case "BASE":
                    System.out.println("pizza type: " + value.getPizzaType() + " 1 €");
                    currentAmount += 1;
                    break;
                case "CALZONE":
                    System.out.println("pizza type: " + value.getPizzaType() + " 1.5 €");
                    currentAmount += 1.5;
                    break;
            }
            if (value.isCheese()) {
                System.out.println("cheese: 1 €");
                currentAmount += 1;
            }
            if (value.isTomatoPaste()) {
                System.out.println("tomato paste: 1 €");
                currentAmount += 1;
            }
            if (value.isSalami()) {
                System.out.println("salami: 1.5 €");
                currentAmount += 1.5;
            }
            if (value.isPepperoni()) {
                System.out.println("pepperoni: 0.6 €");
                currentAmount += 0.6;
            }
            if (value.isBacon()) {
                System.out.println("bacon: 1.2 €");
                currentAmount += 1.2;
            }
            if (value.isGarlic()) {
                System.out.println("garlic: 0.3 €");
                currentAmount += 0.3;
            }
            if (value.isOlives()) {
                System.out.println("olives: 0.5 €");
                currentAmount += 0.5;
            }
            if (value.isCorn()) {
                System.out.println("corn: 0.7 €");
                currentAmount += 0.7;
            }
            System.out.println("--------------------------");
            System.out.println("amount: " + currentAmount + " €");
            System.out.println("quantity: " + value.getPizzaCount());
            System.out.println("--------------------------");
            totalAmount += currentAmount * value.getPizzaCount();
            currentAmount = 0;
        }
        System.out.println("total amount: " + totalAmount + " €");
        System.out.println("**********************");
    }
}
