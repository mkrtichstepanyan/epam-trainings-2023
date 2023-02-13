package homework_5.Qnarik_Khachatryan.pizza;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //Part 4
        //Customer number 7717 wants to order 2 pcs. "Margarita" and 3 pcs. the usual "PepperoniOro".
        Customer customer = new Customer(7717, "Jane Ananyan");

        Pizza pizza1 = new Pizza("Margarita", PizzaType.REGULAR);
        pizza1.addIngredient(IngredientType.TOMATO_PASTE);
        pizza1.addIngredient(IngredientType.PEPPERONI);
        pizza1.addIngredient(IngredientType.GARLIC);
        pizza1.addIngredient(IngredientType.BACON);

        Pizza pizza2 = new Pizza("PepperoniOro", PizzaType.REGULAR);
        pizza2.addIngredient(IngredientType.TOMATO_PASTE);
        pizza2.addIngredient(IngredientType.CHEESE);
        pizza2.addIngredient(IngredientType.SALAMI);
        pizza2.addIngredient(IngredientType.OLIVES);

        Order order1 = new Order(customer);
        order1.addPizza(pizza1, 2);
        order1.addPizza(pizza2, 3);

        // Customer with number 4372 wants to order delivery of 12 pcs. usual pizzas "BasePZZ".

        Customer customer1 = new Customer(4372, "Ani Makaryan");

        Pizza pizza3 = new Pizza("BasePZZ", PizzaType.REGULAR);
        pizza3.addIngredient(IngredientType.TOMATO_PASTE);
        pizza3.addIngredient(IngredientType.PEPPERONI);
        pizza3.addIngredient(IngredientType.GARLIC);

        Order order2 = new Order(customer1);
//        order2.addPizza(pizza3, 12); error, because more than 10 pizzas in one order


        // Part 1
//        order1.displayPizzaAttributes(pizza1);

        // Part 3
//        order1.printCheck();

// To see pizzas in order
//        System.out.println(Arrays.toString(order1.newPizzas));

    }
}
