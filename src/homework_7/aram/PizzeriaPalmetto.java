package homework_7.aram;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Sevak");
        customer.setPhoneNumber("+37498000000");

        Order order = new Order();
        order.setCustomer(customer);
        Pizza pizza1=new Pizza("MyPizza1",PizzaType.CALZONE,1);
        pizza1.addIngredient(Ingredient.PEPPERONI);
        pizza1.addIngredient(Ingredient.OLIVES);

        Pizza pizza2=new Pizza("MyPizza2",PizzaType.REGULAR,6);
        pizza2.addIngredient(Ingredient.TOMATO_PASTE);
        pizza2.addIngredient(Ingredient.CHEESE);
        pizza2.addIngredient(Ingredient.PEPPERONI);
        order.addPizza(pizza1.getName(),pizza1.getPizzaType(),pizza1.getIngredients(), pizza1.getQuantity());
        order.addPizza(pizza2.getName(),pizza2.getPizzaType(),pizza2.getIngredients(), pizza2.getQuantity());
        Printer.printCheck(order);
    }
}
