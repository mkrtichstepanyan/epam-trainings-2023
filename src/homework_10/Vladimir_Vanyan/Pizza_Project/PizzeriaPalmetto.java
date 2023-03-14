package homework_10.Vladimir_Vanyan.Pizza_Project;

import homework_10.Vladimir_Vanyan.Exceptions.InvalidIngredientException;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Printer printer = new Printer();

        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Pizza pizzaMargarita = new Pizza("Margarita", PizzaType.CALZONE);

        Pizza pizzaItaliano = new Pizza("Italiano", PizzaType.REGULAR);
        try {
            pizzaItaliano.addIngredient(Ingredient.CORN);
            pizzaItaliano.addIngredient(Ingredient.PEPERONI);
            pizzaItaliano.addIngredient(Ingredient.TOMATO_PASTE);
            pizzaItaliano.addIngredient(Ingredient.CHEESE);
            pizzaItaliano.addIngredient(Ingredient.BACON);
            pizzaItaliano.addIngredient(Ingredient.GARLIC);
        } catch (InvalidIngredientException exception) {
            System.out.println("Ingredients are invalid");
        }

        Order order = new Order();
        order.setCustomer(customer);
        try {
            order.addProduct(pizzaItaliano, 2);
            order.addProduct(pizzaItaliano, 2);
            order.addProduct(pizzaMargarita, 10);
        } catch (Exception exception) {
            System.out.println("Pizza types are not correct");
        }

        printer.printOrderAttributes(order);
        printer.printCheck(order);
    }
}
