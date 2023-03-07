package homework_10.robert_nazaryan.exceptionsHomework;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Aeu");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};
        Ingredient[] ingredients2 = {Ingredient.CORN, Ingredient.GARLIC, Ingredient.PEPPERONI, Ingredient.BACON};

        order.addPizza("za", PizzaType.CALZONE, ingredients, 10);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients2, 5);
        order.addDrink(Drink.FANTA, 5);
        order.addDrink(Drink.SPRITE, 2);

        Printer.printCheck(order);
    }
}
