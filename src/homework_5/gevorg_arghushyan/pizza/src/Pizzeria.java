package homework_5.gevorg_arghushyan.pizza.src;

import java.util.*;

public class Pizzeria {
    private static ArrayList<Pizza> pizzas = new ArrayList<>();

    public static void main(String[] args) {
        Order order = new Order();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Pizzeria Palmetto!");
        System.out.println("Currently, it is possible to use 7 different ingredients for making pizza:");
        System.out.println("Cheese, Pepperoni, Sausage, Mushrooms, Onions, Green Peppers, Black Olives");
        while (true) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Order Pizza");
            System.out.println("2. View Orders");
            System.out.println("3. Exit");
            System.out.print("Enter choice (1-3): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    orderPizza(scanner);
                    break;
                case 2:
                    viewOrders();
                    break;
                case 3:
                    System.out.println("Thank you for choosing Pizzeria Palmetto!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void orderPizza(Scanner scanner) {
        Customer customer = new Customer();
        System.out.print("Enter pizza name: ");
        String name = scanner.next();
        if (name.length() < 4 || name.length() > 20) {
            name = "customer_" + customer.getCustomerNumber() + "_" + (pizzas.size() + 1);
        }
        System.out.println("Choose pizza type: ");
        System.out.println("1. Regular");
        System.out.println("2. Closed (Calzone)");
        System.out.print("Enter choice (1-2): ");
        int typeChoice = scanner.nextInt();
        String type = (typeChoice == 1) ? "Regular" : "Closed (Calzone)";
        List<String> ingredients = new ArrayList<>();


        while (true) {
            System.out.println("Choose ingredients (up to 7): ");
            System.out.println("1. Cheese");
            System.out.println("2. Pepperoni");
            System.out.println("3. Sausage");
            System.out.println("4. Mushrooms");
            System.out.println("5. Onions");
            System.out.println("6. Green Peppers");
            System.out.println("7. Black Olives");
            System.out.println("0. Done");
            System.out.print("Enter choice (0-7): ");
            int ingredientChoice = scanner.nextInt();
            if (ingredientChoice == 0) {
                break;
            }


            switch (ingredientChoice) {
                case 1:
                    ingredients.add("Tomato paste");
                    break;
                case 2:
                    ingredients.add("Cheese");
                    break;
                case 3:
                    ingredients.add("Salami");
                    break;
                case 4:
                    ingredients.add("Bacon");
                    break;
                case 5:
                    ingredients.add("Garlic");
                    break;
                case 6:
                    ingredients.add("Corn");
                    break;
                case 7:
                    ingredients.add("Pepperoni");
                    break;
                case 8:
                    ingredients.add("Olives");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        }

        System.out.print("Enter pizza quantity: ");
        int quantity = Integer.parseInt(scanner.next());
        Pizza pizza = new Pizza(name, type, ingredients, quantity);
        // pizzas.add(pizza);
        System.out.println("\nOrder placed successfully!");
        System.out.println("Order number: " + pizza.getOrderNumber());
        System.out.println("Name: " + pizza.getName());
        System.out.println("Type: " + pizza.getType());
        System.out.println("Ingredients: " + pizza.getIngredients());
        System.out.println("Price: $" + pizza.getPrice());
    }

    private static void viewOrders() {
        System.out.println("\nOrders:");
        for (Pizza pizza : pizzas) {
            System.out.println("Order number: " + pizza.getOrderNumber());
            System.out.println("Name: " + pizza.getName());
            System.out.println("Type: " + pizza.getType());
            System.out.println("Ingredients: " + pizza.getIngredients());
            System.out.println("Price: $" + pizza.getPrice());
            System.out.println("---");
        }
    }
}