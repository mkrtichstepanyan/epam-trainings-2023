package homework_5.Anna_Manukyan.Pizzeria;

import java.util.ArrayList;

public class PizzaTest {
    public static void main(String[] args) {
        ArrayList<Ingredient> ingredientsForMargarita = new ArrayList<>();
        ingredientsForMargarita.add(Ingredient.TOMATO_PASTE);
        ingredientsForMargarita.add(Ingredient.GARLIC);
        ingredientsForMargarita.add(Ingredient.BACON);
        Pizza pizzaMargarita = new Pizza(PizzaType.REGULAR, "Margarita", ingredientsForMargarita, 2);

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

        Order order = new Order();
        order.setCustomerNumber(7717);
        ArrayList<Pizza> pizzaList = order.getPizzaList();
        pizzaList.add(pizzaMargarita);
        pizzaList.add(pizza);
        order.createValidName(pizzaList);
        order.setPizzaList(pizzaList);
        order.printCheck();

        System.out.println("______________________________");

        Order secondOrder = new Order();
        secondOrder.setCustomerNumber(4372);
        ArrayList<Pizza> secondOrderPizzaList = secondOrder.getPizzaList();
        secondOrderPizzaList.add(pizzaBasePZZ);
        secondOrder.createValidName(pizzaList);
        secondOrder.setPizzaList(secondOrderPizzaList);
        secondOrder.printCheck();
    }
}
