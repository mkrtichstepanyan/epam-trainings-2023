package homework_7.Argishti_Mesropyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Argisht");
        customer.setPhoneNumber("+374374374");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE,
        Ingredient.OLIVES};

        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 10);
        order.addPizza("MyPizza2", PizzaType.REGULAR, ingredients, 5);

        Printer.printCheck(order);
    }
}
