package homework_7.Vladimir_Vanyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Printer printer = new Printer();

        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Pizza pizzaMargarita = new Pizza("Margarita", PizzaType.CALZONE);

        Pizza pizzaItaliano = new Pizza("Italiano", PizzaType.REGULAR);
        pizzaItaliano.addIngredient(Ingredient.CORN);
        pizzaItaliano.addIngredient(Ingredient.PEPERONI);
        pizzaItaliano.addIngredient(Ingredient.TOMATO_PASTE);
        pizzaItaliano.addIngredient(Ingredient.CHEESE);
        pizzaItaliano.addIngredient(Ingredient.BACON);
        pizzaItaliano.addIngredient(Ingredient.GARLIC);

        Order order = new Order();
        order.setCustomer(customer);

        order.addProduct(pizzaItaliano, 2);
        order.addProduct(pizzaItaliano, 2);
        order.addProduct(pizzaMargarita, 10);


        printer.printOrderAttributes(order);
        printer.printCheck(order);
    }
}
