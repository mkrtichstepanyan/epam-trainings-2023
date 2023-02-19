package homework_7.Anna_Manukyan;


import static homework_7.Anna_Manukyan.Pizza.printPizzaIngredients;

public class Printer {

    private double totalSum = 0;

    public void printCheck(Order order) {
        totalSum = 0;
        Food[] foods = order.getFoods();
        leadingLine();
        System.out.println("Order: " + order.getOrderNumber());
        System.out.println("Client: " + order.getCustomer().getNumber());
        for (Food food : foods) {
            if (food != null) {
                if (food.foodType.equals(FoodType.PIZZA)) {
                    printPizzaCheck((Pizza) food);
                } else if (food.foodType.equals(FoodType.SWEETS)) {
                    printSweetCheck((Sweets) food);
                }
            }
        }
        delimiter();
        System.out.println("Total amount " + totalSum + " €");
        delimiter();
        System.out.println("Order time " + order.orderTime.getHour() + ":" + order.orderTime.getMinute());
        trailingLine();
    }

    private void printSweetCheck(Sweets food) {
        System.out.println("Name: " + food.getName());
        delimiter();
        System.out.println("Food type (" + food.getName() + ") ");
        delimiter();
        double sweetsAmount = food.calculatePrice();
        System.out.println("Amount: " + sweetsAmount + " €");
        System.out.println("Quantity " + food.getQuantity());
        delimiter();
        totalSum += sweetsAmount * food.quantity;
    }

    private void printPizzaCheck(Pizza food) {
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

    private static void leadingLine() {
        System.out.println("********************");
    }

    private static void trailingLine() {
        System.out.println("********************");
    }

    private static void delimiter() {
        System.out.println("--------------------------");
    }


}
