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

        Customer customer1 = new Customer();
        Order order1 = new Order(customer1, quantity);


        Pizza pizza1 = new Pizza("Margherita", 'b');
        pizza1.setQuantity(quantity);
        pizza1.addIngredient(Ingredients.tomatoPaste());
        pizza1.addIngredient(Ingredients.cheese());
        pizza1.addIngredient(Ingredients.garlic());

        Pizza pizza2 = new Pizza("PepperoniOro", 'c');
        pizza2.setQuantity(quantity);
        pizza2.addIngredient(Ingredients.tomatoPaste());
        pizza2.addIngredient(Ingredients.cheese());
        pizza2.addIngredient(Ingredients.garlic());

        order1.setPizzas(pizza1, pizza2);


        printCheck check1 = new printCheck(order1, customer1);
        check1.displayOrder(pizza1);
        check1.displayOrder(pizza2);


        check1.printCheck();
    }
}
