package homework_5.Ani_Barseghyan;

import java.util.Scanner;

public class PizzaDemo {
    public static void main(String[] args) {
        String pizzaName;
        char pizzaType;
        char choice;
        int quantity;
        int toppingCount;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to customize the ingredients? Y/N: ");
        choice = scanner.next().charAt(0);

        do {
            System.out.print("Please enter the quantity: ");
            quantity = scanner.nextInt();
        } while (quantity < 1 || quantity > 10);

        do {
            System.out.print("Please chose the pizza type Base or Calzone: b / c: ");
            pizzaType = scanner.next().charAt(0);
        } while (pizzaType != 'b' && pizzaType != 'B' && pizzaType != 'c' && pizzaType != 'C');


        if (choice == 'Y') {
            System.out.print("Please enter Pizza name: ");
            pizzaName = scanner.next();



//        System.out.println("See the topping list we offer: ");
//        System.out.println("1. Tomato paste 1$");
//        System.out.println("2. Cheese 1$");
//        System.out.println("3. Salami 1.5$");
//        System.out.println("4. Bacon 1.2$");
//        System.out.println("5. Garlic 0.3$");
//        System.out.println("6. Corn 0.7$");
//        System.out.println("7. Pepperoni 0.6$");
//        System.out.println("8. Olives 0.5$");
//
//
//        do {
//            System.out.println("We offer only 8 toppings");
//            System.out.println("How many toppings you want to add");
//            toppingCount = scanner.nextInt();
//        } while (toppingCount > 8);
//
//        System.out.println("Enter the topping numbers");
//
//
//        int[] ingridients = new int[toppingCount];
//
//        for (int i = 0; i < toppingCount; i++) {
//            ingridients[i] = scanner.nextInt()-1;
//        }

        }


//        Pizza pizza1 = new Pizza();
//        pizza1.setOrderNumber((int) Math.floor(Math.random() * 90000) + 10000);
//        pizza1.setCustomerNumber((int) Math.floor(Math.random() * 10000) + 1);
//        pizza1.setPizzaName(pizzaName);
//        pizza1.setPizzaType(pizzaType);
//        pizza1.setQuantity(quantity);
////        pizza1.setToppingCount(toppingCount);
////        pizza1.setIngredientsIndex(ingridients);
//       pizza1.addIngredient();
//
//
//        pizza1.displayOrder();
//        System.out.print("Pizza " + pizza1.getPizzaName() + " has toppings ");
//        for (int i = 0; i < toppingCount; i++) {
//            System.out.println(pizza1.getToppings());
//        }
//        System.out.println("and costs " + "$");

        // pizza1.printCheck();

        Pizza pizza2 = new Pizza("Margherita", 'b');
        pizza2.setQuantity(quantity);
        pizza2.setPizzaType(pizzaType);
        pizza2.addIngredient(Ingredients.tomatoPaste());
        pizza2.addIngredient(Ingredients.cheese());
        pizza2.addIngredient(Ingredients.garlic());
        Order order2 = new Order();
        printCheck check = new printCheck(order2, pizza2);
        check.displayOrder();
        check.printCheck();
    }
}
