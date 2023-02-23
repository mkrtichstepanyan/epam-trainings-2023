package homework_7.Araksya_Ghazaryan;
public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");


        Pizza pizza = new Pizza("NewPizza",PizzaType.REGULAR,3);
        pizza.addIngredient(Ingredient.BACON);
        pizza.addIngredient(Ingredient.BACON);
        pizza.addIngredient(Ingredient.SALAMI);
        pizza.addIngredient(Ingredient.CORN);

        Order order = new Order();
        order.setCustomer(customer);
        order.addPizza(pizza.getName(), pizza.getPizzaType(), pizza.getIngredients(), pizza.getQuantity());
        order.addPizza(Pizza.MARGARITA.getName(), Pizza.MARGARITA.getPizzaType(),Pizza.MARGARITA.getIngredients(), Pizza.MARGARITA.getQuantity());
        order.addPizza(Pizza.ITALIANO.getName(), Pizza.ITALIANO.getPizzaType(),Pizza.ITALIANO.getIngredients(), Pizza.ITALIANO.getQuantity());
        order.addPizza(Pizza.PEPPERONI.getName(), Pizza.PEPPERONI.getPizzaType(), Pizza.PEPPERONI.getIngredients(),Pizza.PEPPERONI.getQuantity() );
        Printer.printCheck(order);
    }
}
