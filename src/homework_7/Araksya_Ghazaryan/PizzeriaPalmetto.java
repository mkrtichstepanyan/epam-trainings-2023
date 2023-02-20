package homework_7.Araksya_Ghazaryan;
public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");
        Pizza pizza = new Pizza("Italiano", PizzaType.REGULAR, 2);
        pizza.addIngredient(Ingredient.BACON);
        pizza.addIngredient(Ingredient.CORN);
        pizza.addIngredient(Ingredient.TOMATO_PASTE);
        Order order = new Order();
        order.setCustomer(customer);
        order.addPizza(pizza.getName(), pizza.getPizzaType(), pizza.getIngredients(), pizza.getQuantity());
        order.addPizza(Pizza.MARGARITA.getName(), Pizza.MARGARITA.getPizzaType(),
                Pizza.MARGARITA.getIngredients(), Pizza.MARGARITA.getQuantity());
        Printer.printCheck(order);
    }
}