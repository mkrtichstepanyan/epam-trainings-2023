package homework_5.Anna_Manukyan.Pizzeria;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        ArrayList<Ingredient> ingredientsForMargarita = new ArrayList<>();
        ingredientsForMargarita.add(Ingredient.TOMATO_PASTE);
        ingredientsForMargarita.add(Ingredient.GARLIC);
        ingredientsForMargarita.add(Ingredient.BACON);
        Pizza pizzaMargarita = new Pizza(PizzaType.REGULAR, null, ingredientsForMargarita, 2);

        ArrayList<Ingredient> ingredientsForPepperoniOro = new ArrayList<>();
        ingredientsForPepperoniOro.add(Ingredient.TOMATO_PASTE);
        ingredientsForPepperoniOro.add(Ingredient.CHEESE);
        ingredientsForPepperoniOro.add(Ingredient.SALAMI);
        ingredientsForPepperoniOro.add(Ingredient.OLIVES);
        Pizza pizza = new Pizza(PizzaType.CALZONE, "PepperoniOro", ingredientsForPepperoniOro, 3);

        ArrayList<Ingredient> ingredientsForBasePZZ = new ArrayList<>();
        ingredientsForBasePZZ.add(Ingredient.TOMATO_PASTE);
        ingredientsForBasePZZ.add(Ingredient.CHEESE);
        ingredientsForBasePZZ.add(Ingredient.SALAMI);
        ingredientsForBasePZZ.add(Ingredient.OLIVES);
        Pizza pizzaBasePZZ = new Pizza(PizzaType.CALZONE, "BasePZZ", ingredientsForBasePZZ, 12);

        Customer customer1 = new Customer("First customer");
        Order order = new Order();
        order.setCustomer(customer1);
        ArrayList<Pizza> pizzaList = order.getPizzaList();
        pizzaList.add(pizzaMargarita);
        pizzaList.add(pizza);
        if (Order.isValidPizzasCount(pizzaList)) {
            order.setPizzaList(pizzaList);
            order.createValidName(pizzaList);
            order.printCheck();
        }

        System.out.println("______________________________");

        Customer customer2 = new Customer("Second customer");
        Order secondOrder = new Order();
        secondOrder.setCustomer(customer2);
        ArrayList<Pizza> secondOrderPizzaList = secondOrder.getPizzaList();
        secondOrderPizzaList.add(pizzaBasePZZ);
        if (Order.isValidPizzasCount(secondOrderPizzaList)) {
            secondOrder.createValidName(secondOrderPizzaList);
            secondOrder.setPizzaList(secondOrderPizzaList);
            secondOrder.printCheck();
        }

    }
}
