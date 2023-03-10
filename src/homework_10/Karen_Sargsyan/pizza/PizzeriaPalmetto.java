package homework_10.Karen_Sargsyan.pizza;

import homework_10.Karen_Sargsyan.pizza.barbecueEnum.BarbecueMeatType;
import homework_10.Karen_Sargsyan.pizza.barbecueEnum.IngredientBarbecue;
import homework_10.Karen_Sargsyan.pizza.pizzaEnum.IngredientPizza;
import homework_10.Karen_Sargsyan.pizza.pizzaEnum.PizzaType;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
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
    }

}
