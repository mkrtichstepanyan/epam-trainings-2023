package homework_5.Ani_Barseghyan;

import java.util.Scanner;

public class PizzaDemo {
    public static void main(String[] args) {
        int quantity;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please enter the quantity: ");
            quantity = scanner.nextInt();
        } while (quantity < 1 || quantity > 10);

        // New customer1 with 2 pizza orders
        Customer customer1 = new Customer();
        Order order1 = new Order(customer1, quantity);


        Pizza pizza1 = new Pizza("Margherita", 'b');
        pizza1.setQuantity(quantity);
        pizza1.setPizzaName(pizza1.getPizzaName(), order1.getOrderNumber());
        pizza1.addIngredient(Ingredients.tomatoPaste());
        pizza1.addIngredient(Ingredients.cheese());
        pizza1.addIngredient(Ingredients.garlic());

        Pizza pizza2 = new Pizza("PepperoniOro", 'c');
        pizza2.setQuantity(quantity);
        pizza2.setPizzaName(pizza2.getPizzaName(), order1.getOrderNumber());
        pizza2.addIngredient(Ingredients.tomatoPaste());
        pizza2.addIngredient(Ingredients.cheese());
        pizza2.addIngredient(Ingredients.garlic());

        order1.setPizzas(pizza1, pizza2);


        printCheck check1 = new printCheck(order1, customer1);
        check1.displayOrder(pizza1);
        check1.displayOrder(pizza2);


        check1.printCheck();


        // New customer2 with 1 pizza order

        Customer customer2 = new Customer();
        Order order2 = new Order(customer2, 1);


        Pizza pizza3 = new Pizza();
        pizza3.setQuantity(5);
        pizza3.setPizzaName(pizza3.getPizzaName(), order2.getOrderNumber());
        pizza3.setPizzaType(pizza3.getPizzaType());
        order2.setPizzas(pizza3);

        printCheck check2 = new printCheck(order2, customer2);
        check2.displayOrder(pizza3);
        check2.printCheck();


        // New customer3 with 1 pizza orders
        Customer customer3 = new Customer();
        Order order3 = new Order(customer3, quantity);


        Pizza pizza4 = new Pizza("Margherita");
        pizza4.setQuantity(quantity);
        pizza4.setPizzaName(pizza4.getPizzaName(), order3.getOrderNumber());
        pizza4.addIngredient(Ingredients.tomatoPaste());
        order3.setPizzas(pizza4);

        printCheck check3 = new printCheck(order3, customer3);
        check3.displayOrder(pizza4);
        check3.printCheck();

    }
}
