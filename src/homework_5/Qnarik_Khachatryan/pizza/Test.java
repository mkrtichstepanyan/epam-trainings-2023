package homework_5.Qnarik_Khachatryan.pizza;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Customer customer1 = new Customer(12345, "Anna Ananyan");

        Order order1 = new Order(customer1);

        Pizza pizza1 = new Pizza("Margarita", PizzaType.CALZONE);

        pizza1.addIngredient(IngredientType.TOMATO_PASTE);
        pizza1.addIngredient(IngredientType.CHEESE);
        pizza1.addIngredient(IngredientType.PEPPERONI);
        pizza1.addIngredient(IngredientType.GARLIC);
        pizza1.addIngredient(IngredientType.BACON);


        Pizza pizza2 = new Pizza("Cheese", PizzaType.REGULAR);

        pizza2.addIngredient(IngredientType.TOMATO_PASTE);
        pizza2.addIngredient(IngredientType.CHEESE);
        pizza2.addIngredient(IngredientType.SALAMI);
        pizza2.addIngredient(IngredientType.OLIVES);
        order1.addPizza(pizza1, 2);
        order1.addPizza(pizza2, 5);


        order1.displayPizzaAttributes(pizza1);


        order1.printCheck();

//        System.out.println(Arrays.toString(order1.pizzas));

    }
}
