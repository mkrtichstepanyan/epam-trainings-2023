package homework_7.garik_gharibyan.fast_foot;

import homework_7.garik_gharibyan.fast_foot.foots.Food;
import homework_7.garik_gharibyan.fast_foot.foots.drink.Drink;
import homework_7.garik_gharibyan.fast_foot.foots.pizza.Ingredient;
import homework_7.garik_gharibyan.fast_foot.foots.pizza.Pizza;

public class Printer {

    private void printStartLine() {
        System.out.println("**************************************\n");
    }

    private void printOrderInfo(Order order) {
        System.out.println(
                "Order: " + order.getOrderNumber() + "\n" +
                        "Client: " + order.getCustomer().getNumber());
    }

    private void printFoodInfo(Food[] foods) {
        for (int i = 0; i < foods.length; i++) {
            System.out.print((i + 1) + ". ");
            if (foods[i].getClass() == Pizza.class) {
                printPizzaInfo((Pizza) foods[i]);
            } else {
                printDrinkInfo((Drink) foods[i]);
            }
        }
    }


    public void printTotalAmountByOrder(Order order) {
        System.out.println(order.calculateTotalAmountOfOrder());
    }

    private void printFinishLine() {
        System.out.println("**************************************\n\n");
    }


    private void printPizzaInfo(Pizza pizza) {
        System.out.println(
                "Name: " + pizza.getName() + "\n" +
                        "---------------------------" + "\n" +
                        "Pizza base: " + pizza.getPizzaType().getPizzaTypeName() + " " +
                        pizza.getPizzaType().getPizzaTypePrice());

        printIngredients(pizza.getIngredients());
        System.out.println(
                "---------------------------" + "\n" +
                        "Amount: " + pizza.getPrice() + "\n" +
                        "Quantity: " + pizza.getQuantity() + "\n" +
                        "---------------------------");

    }

    private void printDrinkInfo(Drink drink) {
        System.out.println(
                "Name: " + drink.getName() + "\n" +
                        "---------------------------" + "\n" +
                        "Drink base: " + drink.getName() + " " + drink.getPrice() + "\n" +
                        "Quantity: " + drink.getQuantity() + "\n" +
                        "---------------------------");

    }

    private void printIngredients(Ingredient[] ingredients) {
        for (Ingredient i : ingredients) {
            System.out.println(i.getName() + " " + i.getPrice());
        }
    }

    public void printCheck(Order order) {

        printStartLine();
        printOrderInfo(order);
        printFoodInfo(order.getFoods());
        printTotalAmountByOrder(order);
        printFinishLine();

    }

    public void printOrderAttributes(Order order) {

        System.out.println(
                "Order: " + order.getOrderNumber() + "\n" +
                        "Customer number: " + order.getCustomer().getNumber() + "\n" +
                        "All Quantity Order: " + order.getFoods().length);
        System.out.println("------------------------------");
        for (Food food : order.getFoods()) {
            System.out.print(
                    "food name: " + food.getName() + " price: " + food.getPrice() + " quantity: " + food.getQuantity() + "\n"
            );
        }
    }

}
