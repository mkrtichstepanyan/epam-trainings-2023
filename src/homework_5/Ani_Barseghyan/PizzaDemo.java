package homework_5.Ani_Barseghyan;

import java.util.Scanner;

public class PizzaDemo {
    public static void main(String[] args) {
        String pizzaName;
        char pizzaType;
        int quantity;
        int toppingMaxCount = 8;
        int toppingCount;
        String[] availableToppings = {"Tomato paste", "Cheese", "Salami", "Bacon", "Garlic", "Corn", "Pepperoni", "Olives"};
        String[] ingredients;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter Pizza name: ");
        pizzaName = scanner.next();


        do {
            System.out.print("Please chose the pizza type Base or Calzone: b / c: ");
            pizzaType = scanner.next().charAt(0);
        } while (pizzaType != 'b' && pizzaType != 'B' && pizzaType != 'c' && pizzaType != 'C');


        do {
            System.out.print("Please enter the quantity: ");
            quantity = scanner.nextInt();
        } while (quantity < 1 || quantity > 10);

        System.out.println("See the topping list we offer: ");
        System.out.println("1. Tomato paste 1$");
        System.out.println("2. Cheese 1$");
        System.out.println("3. Salami 1.5$");
        System.out.println("4. Bacon 1.2$");
        System.out.println("5. Garlic 0.3$");
        System.out.println("6. Corn 0.7$");
        System.out.println("7. Pepperoni 0.6$");
        System.out.println("8. Olives 0.5$");


        do {
            System.out.println("We offer only " + toppingMaxCount + " toppings");
            System.out.println("How many toppings you want to add");
            toppingCount = scanner.nextInt();
        } while (toppingCount > toppingMaxCount);

        ingredients = new String[toppingCount];

        System.out.println("Enter the topping numbers");
        for (int i = 0; i < toppingCount; i++) {
            int top = scanner.nextInt();
            for (int j = 0; j < availableToppings.length; j++) {
                if (top == j + 1) {
                    ingredients[i] = availableToppings[j];
                }
            }
        }


        Pizza pizza1 = new Pizza();
        pizza1.setOrderNumber((int) Math.floor(Math.random() * 90000) + 10000);
        pizza1.setCustomerNumber((int) Math.floor(Math.random() * 10000) + 1);
        pizza1.setPizzaName(pizzaName);
        pizza1.setPizzaType(pizzaType);
        pizza1.setQuantity(quantity);
        pizza1.setIngredients(ingredients);


        pizza1.displayOrder();
        System.out.print("Pizza " + pizza1.getPizzaName() + " has toppings ");
        for (int i = 0; i < ingredients.length; i++) {
            System.out.print(ingredients[i] + ", ");
        }
        System.out.println("and costs " + pizza1.addIngredient(pizza1.getIngredients()) + "$");

        pizza1.printCheck();

    }
}
