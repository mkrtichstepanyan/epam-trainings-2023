package homework_7.rafik_pahlevanyan;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("James");
        customer.setPhoneNumber("+37498000000");
        Pizza pizza = new Pizza("Tashir",PizzaType.REGULAR,5);
        pizza.addIngredient(Ingredient.CORN);
        pizza.addIngredient(Ingredient.CORN);//will be print contains ingredient
        pizza.addIngredient(Ingredient.TOMATO_PASTE);
        pizza.addIngredient(Ingredient.BACON);
        Order order = new Order();
        order.setCustomer(customer);
        order.addPizza(pizza.getName(), pizza.getPizzaType(), pizza.getIngredients(), pizza.getQuantity());

        //this is our Margarita pizza , customer will not create it
        order.addPizza(Pizza.MARGARITA.getName(),Pizza.MARGARITA.getPizzaType(),
                Pizza.MARGARITA.getIngredients(), Pizza.MARGARITA.getQuantity());

        Printer.printCheck(order);
    }
}
