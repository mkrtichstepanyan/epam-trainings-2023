package homework_7.rafik_pahlevanyan.ordering_system;

import homework_7.rafik_pahlevanyan.ordering_system.drink.Juice;
import homework_7.rafik_pahlevanyan.ordering_system.model.Customer;
import homework_7.rafik_pahlevanyan.ordering_system.model.Order;
import homework_7.rafik_pahlevanyan.ordering_system.pizza.Ingredient;
import homework_7.rafik_pahlevanyan.ordering_system.pizza.Pizza;
import homework_7.rafik_pahlevanyan.ordering_system.pizza.PizzaType;
import homework_7.rafik_pahlevanyan.ordering_system.util.Printer;

public class PizzeriaPalmetto {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Johny");
        customer.setPhoneNumber("+37498000000");
                                //pizza name will be set customer name
        Pizza pizza = new Pizza("asd", PizzaType.REGULAR,5);
        pizza.addIngredient(Ingredient.CORN);
        //duplicate ingredients
        pizza.addIngredient(Ingredient.CORN);
        pizza.addIngredient(Ingredient.TOMATO_PASTE);
        Order order = new Order();
        order.setCustomer(customer);

        order.addProduct(pizza.getName(), pizza.getProductType(), pizza.getIngredients(), pizza.getQuantity());
        order.addProduct(Pizza.MARGARITA.getName(), Pizza.MARGARITA.getProductType(), Pizza.MARGARITA.getIngredients(), Pizza.MARGARITA.getQuantity());

        order.addDrink(Juice.COCA_COLA,2);
        order.addDrink(Juice.FANTA,10);







        Printer.printCheck(order);
        order.printOrderAttributes();
    }
}
