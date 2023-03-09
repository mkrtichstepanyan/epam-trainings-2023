package homework_10.Karen_Sargsyan.pizza;

import homework_10.Karen_Sargsyan.pizza.myEnum.BarbecueMeatType;
import homework_10.Karen_Sargsyan.pizza.myEnum.IngredientBarbecue;
import homework_10.Karen_Sargsyan.pizza.myEnum.IngredientPizza;
import homework_10.Karen_Sargsyan.pizza.myEnum.PizzaType;
import homework_10.Karen_Sargsyan.pizza.myException.DoubleIngredientException;
import homework_10.Karen_Sargsyan.pizza.myException.LatinNameException;
import homework_10.Karen_Sargsyan.pizza.myException.PhoneNumberException;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        try {
            Customer customer = new Customer("Karen Sargsyan", "+37498000000");
            Order order = new Order(customer);

            IngredientPizza[] ingredients1 = {IngredientPizza.GARLIC, IngredientPizza.CORN, IngredientPizza.CHEESE, IngredientPizza.TOMATO_PASTE,
                    IngredientPizza.PEPPERONI};
            Item pizza = new Pizza("Margarita", PizzaType.REGULAR, ingredients1, 3);
            order.addItem(pizza);

            IngredientBarbecue[] ingredients2 = {IngredientBarbecue.BREAD, IngredientBarbecue.ONION, IngredientBarbecue.TOMATO_PASTE};
            Item barbecue = new Barbecue(BarbecueMeatType.CHICKEN_MEAT, ingredients2, 3);
            order.addItem(barbecue);

            Printer.printCheck(order);
        } catch (DoubleIngredientException | LatinNameException | PhoneNumberException e) {
            e.printStackTrace();
            System.err.println("Please retry and enter a correct information !");
        }
    }

}
