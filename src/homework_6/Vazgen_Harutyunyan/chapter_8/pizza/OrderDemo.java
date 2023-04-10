package homework_6.Vazgen_Harutyunyan.chapter_8.pizza;
import java.util.Scanner;

public class OrderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the customer number: ");
        int customerNumber = scanner.nextInt();

        Order order = new Order(customerNumber);

        System.out.print("Enter the number of pizzas: ");
        int numPizzas = scanner.nextInt();

        for (int i = 0; i < numPizzas; i++) {
            System.out.print("Enter the name of pizza " + (i + 1) + ": ");
            String name = scanner.nextLine();
            name = scanner.nextLine();

            System.out.print("Enter the type of pizza (regular/closed): ");
            String type = scanner.nextLine();

            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            Pizza pizza = new Pizza(name, type, quantity);
            order.addPizza(pizza);

            System.out.print("Enter the number of ingredients for pizza " + (i + 1) + ": ");
            int numIngredients = scanner.nextInt();

            for (int j = 0; j < numIngredients; j++) {
                System.out.print("Enter the ingredient " + (j + 1) + ": ");
                String ingredient = scanner.nextLine();
                ingredient = scanner.nextLine();
                pizza.addIngredient(ingredient);
            }
        }

        order.printCheck();
    }
}
