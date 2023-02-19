package homework_7.Anna_Manukyan;


import static homework_7.Anna_Manukyan.Pizza.printPizzaIngredients;

public class Printer {

    private static double totalSum = 0;
    public static void printCheck(Order order) {
        Food[] foods = order.getFoods();
        leadingLine();
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
        for (Food food:foods) {
                if (food != null && food.foodType.equals(FoodType.PIZZA)) {
                    printPizzaCheck((Pizza)food);
                }
        }
        delimiter();
        System.out.println("Total amount " + totalSum + " €");
        delimiter();
        System.out.println("Order time " + order.orderTime.getHour() + ":" + order.orderTime.getMinute());
        trailingLine();
    }

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trailingLine() {
        System.out.println("********************");
    }

    private static void delimiter() {
        System.out.println("--------------------------");
    }

    private static void printPizzaCheck(Pizza food){
            if (food != null){
                System.out.println("Name: " + food.getName());
                delimiter();
                System.out.println("Pizza base (" + food.getPizzaType().getName() + ") " + (food.calculateBasePrice()) + " €");
                printPizzaIngredients(food);
                delimiter();
                double pizzaAmount = food.calculatePrice();
                System.out.println("Amount: " + pizzaAmount + " €");
                System.out.println("Quantity " + food.getQuantity());
                delimiter();
                totalSum += pizzaAmount * food.getQuantity();
            }

    }
}
