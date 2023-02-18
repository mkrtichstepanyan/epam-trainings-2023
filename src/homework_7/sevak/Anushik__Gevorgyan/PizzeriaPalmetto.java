package homework_7.sevak.Anushik__Gevorgyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Anushik");
        customer.setPhoneNumber("+37494444444");
        Pizza pizza = new Pizza("California", PizzaType.CALZONE, 4);
        pizza.addIngredient(Ingredient.TOMATO_PASTE);
        pizza.addIngredient(Ingredient.CHEESE);
        pizza.addIngredient(Ingredient.GARLIC);
        pizza.addIngredient(Ingredient.OLIVES);



        Order order = new Order();
        order.setCustomer(customer);
        order.addPizza(pizza.getName(), pizza.getPizzaType(), pizza.ingredients(), pizza.getQuantity());


        order.addPizza(Pizza.PEPPERONI.getName(), Pizza.PEPPERONI.getPizzaType(), Pizza.PEPPERONI.ingredients(), Pizza.PEPPERONI.getQuantity());
        order.addPizza(Pizza.MARGARITA.getName(), Pizza.MARGARITA.getPizzaType(), Pizza.MARGARITA.ingredients(), Pizza.MARGARITA.getQuantity());


        Printer.printCheck(order);
    }
}
