package homework_7.Anush_Ananyan;


public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Anush");

        customer.setPhoneNumber("+37498000000");

        Order order = new Order();

        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};
        Ingredient[] ingredients1 = {Ingredient.BACON, Ingredient.CHEESE, Ingredient.OLIVES, Ingredient.CORN,
                Ingredient.GARLIC, Ingredient.PEPPERONI, Ingredient.TOMATO_PASTE};

        order.addProduct("MyPizza", PizzaType.CALZONE, ingredients, 10);
        order.addProduct("125", PizzaType.REGULAR, ingredients1, 5);
        order.addProduct("MySalad", SaladType.FRUIT, null, 3);

        Printer.printCheck(order);
        order.calculateOrderPrice();
    }
}
