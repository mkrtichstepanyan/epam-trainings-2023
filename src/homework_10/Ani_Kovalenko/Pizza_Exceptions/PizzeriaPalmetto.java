package homework_10.Ani_Kovalenko.Pizza_Exceptions;

import homework_10.Ani_Kovalenko.Pizza_Exceptions.MyExceptions.DoubleIngredientException;
import homework_10.Ani_Kovalenko.Pizza_Exceptions.MyExceptions.LatinNameException;
import homework_10.Ani_Kovalenko.Pizza_Exceptions.MyExceptions.PhoneNumberException;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        try {
            Customer customer = new Customer("sevak", "+374", "98000000");
            Order order = new Order(customer);
            IngredientPizza[] ingredients1 = {IngredientPizza.GARLIC, IngredientPizza.PEPPERONI, IngredientPizza.TOMATO_PASTE,
                    IngredientPizza.BACON, IngredientPizza.CHEESE, IngredientPizza.OLIVES};

            Item pizza = new Pizza("Margarita", PizzaType.REGULAR, ingredients1, 3);
            order.addItem(pizza);

            IngredientBurger[] ingredients2 = {IngredientBurger.CHEESE, IngredientBurger.CHICKEN_MEAT};
            Item burger = new Burger("B", BurgerBreadType.BLACK_BREAD, ingredients2, 2);
            order.addItem(burger);
            Printer.printCheck(order);
        } catch (DoubleIngredientException | PhoneNumberException | LatinNameException e) {
            System.err.println(e);
            System.err.println("Please retry and enter a required information !");
        }
    }
}
