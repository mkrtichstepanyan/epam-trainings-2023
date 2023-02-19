package homework_7.garik_gharibyan;

import homework_7.garik_gharibyan.drink.Drink;
import homework_7.garik_gharibyan.food.Food;
import homework_7.garik_gharibyan.food.pizza.Ingredient;
import homework_7.garik_gharibyan.food.pizza.Pizza;

public class Printer {

    private int index = 1;

    public void printCheck(Order order) {

        printStartLine();
        printOrderInfo(order);
        printFoodsInfo(order.getFoods());
        printDrinkInfo(order.getDrinks());
        printTotalPriceByOrder(order);
        printFinishLine();

    }
    public void printOrderAttributes(Order order) {

        System.out.println(
                "Order: " + order.getOrderNumber() + "\n" +
                        "Customer number: " + order.getCustomer().getNumber() + "\n" +
                        "All Quantity Order: " + order.getFoods().length);
        System.out.println("------------------------------");
        for (Food food : order.getFoods()) {
            if (food != null) {
                System.out.print(
                        "food name: " + food.getName() + " price: " + food.calculatePrice() + " quantity: " + food.getQuantity() + "\n"
                );
            }

        }
        for (Drink drink : order.getDrinks()) {
            if (drink != null) {
                System.out.print(
                        "drink name: " + drink.getName() + " price: " + drink.getPrice() + " quantity: " + drink.getQuantity() + "\n"
                );
            }

        }
    }



    private void printStartLine() {
        System.out.println("**************************************\n");
    }
    private void printOrderInfo(Order order) {
        System.out.println(
                "Order: " + order.getOrderNumber() + "\n" +
                        "Client: " + order.getCustomer().getNumber());
    }
    private void printFoodsInfo(Food[] foods) {
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] == null) {
                break;
            }
            System.out.print((index++) + ". ");
            if (foods[i].getClass() == Pizza.class) {
                printPizzaInfo((Pizza) foods[i]);
            }
        }
    }
    private void printDrinkInfo(Drink[] drinks) {
        for (Drink drink : drinks) {
            if (drink == null) {
                break;
            }
            System.out.print((index++) + ". ");
            System.out.println(
                    "Name: " + drink.getName() + "\n" +
                            "---------------------------" + "\n" +
                            "Drink base: " + drink.getName() + " " + drink.getPrice() + "\n" +
                            "Quantity: " + drink.getQuantity() + "\n" +
                            "---------------------------" + "\n");
        }


    }
    private void printTotalPriceByOrder(Order order) {
        System.out.println("Total price: " + order.calculateTotalPriceOfOrder());
    }
    private void printFinishLine() {
        System.out.println("**************************************\n\n");
    }


    private void printPizzaInfo(Pizza pizza) {
        System.out.println(
                "Name: " + pizza.getName() + "\n" +
                        "---------------------------" + "\n" +
                        "Pizza base: " + pizza.getPizzaType().getName() + " " +
                        pizza.getPizzaType().getPrice());

        printIngredients(pizza.getIngredients());
        System.out.println(
                "---------------------------" + "\n" +
                        "Amount: " + pizza.calculatePrice() + "\n" +
                        "Quantity: " + pizza.getQuantity() + "\n" +
                        "---------------------------");

    }
    private void printIngredients(Ingredient[] ingredients) {
        for (Ingredient i : ingredients) {
            System.out.println(i.getName() + " " + i.getPrice());
        }
    }




//    public void printOrderAttributes1(Order order) {
//        for (Food food : order.getFoods()) {
//            System.out.println("[" + order.getOrderNumber() + order.getCustomer().getNumber() + food.getName() + food.getQuantity() + "]");
//        }
//    }
}
