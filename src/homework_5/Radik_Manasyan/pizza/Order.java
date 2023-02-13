package homework_5.Radik_Manasyan.pizza;

import java.util.Random;

public class Order {
    ListPizza pizza = new ListPizza();

    private final int orderNumber = randomOrderNumber();
    private int clientNumber;

    public void order(int clientNumber, String pizzaName, int countPizza) {
        this.clientNumber = clientNumber;
        pizza.setNameOfPizza(orderNumber, pizzaName, countPizza);
    }

    private int randomOrderNumber() {
        Random rand = new Random();
        int min = 49999;
        return rand.nextInt(min) + min;
    }

    public void pizzaAttribute() {
        System.out.println("[" + orderNumber + ": " + clientNumber
                + ": " + pizza.getPizzaName() + ": " + pizza.getCountPizza() + "]");
    }

    public void addIngredient(String ingredients) {
        pizza.addIngredientsInPizzaIngredients(ingredients);
    }

    public void printCheck() {
        System.out.println(
                "********************************" +
                        "\nOrder: " + orderNumber +
                        "\nClient: " + clientNumber
        );
        pizza.getCheck();
        System.out.println("Total amount: " + pizza.getTotalAmount() + "0 €" + "\n********************************");

    }
}
