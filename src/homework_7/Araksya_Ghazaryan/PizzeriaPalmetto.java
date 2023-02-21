package homework_7.Araksya_Ghazaryan;
public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");
        Order order = new Order();
        order.setCustomer(customer);

        order.addPizza(Pizza.MARGARITA.getName(), Pizza.MARGARITA.getPizzaType(),Pizza.MARGARITA.getIngredients(), Pizza.MARGARITA.getQuantity());
        order.addPizza(Pizza.ITALIANO.getName(), Pizza.ITALIANO.getPizzaType(),Pizza.ITALIANO.getIngredients(), Pizza.ITALIANO.getQuantity());
        order.addPizza(Pizza.PEPPERONI.getName(), Pizza.ITALIANO.getPizzaType(), Pizza.PEPPERONI.getIngredients(),Pizza.ITALIANO.getQuantity() );
        Printer.printCheck(order);
    }
}