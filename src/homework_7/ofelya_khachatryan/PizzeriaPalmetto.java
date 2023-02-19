package homework_7.ofelya_khachatryan;


public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Pizza firstCustomer = new Pizza("regular", PizzaType.REGULAR, 2);
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);

        Ingredient[] ingredients = {Ingredient.CHEESE, Ingredient.SALAMI, Ingredient.TOMATO_PASTE};

        order.addPizza("MyPizza", PizzaType.CALZONE, ingredients, 10);

        order.calculateOrderPrice();
        Printer.printCheck(order);
    }
}
