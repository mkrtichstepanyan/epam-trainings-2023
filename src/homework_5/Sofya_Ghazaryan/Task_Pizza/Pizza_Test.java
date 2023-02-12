package homework_5.Sofya_Ghazaryan.Task_Pizza;

import homework_5.Sofya_Ghazaryan.Task_Pizza.Impl.CustomerImpl;
import homework_5.Sofya_Ghazaryan.Task_Pizza.Impl.OrderImpl;
import homework_5.Sofya_Ghazaryan.Task_Pizza.Impl.PizzaImpl;
import homework_5.Sofya_Ghazaryan.Task_Pizza.model.Customer;
import homework_5.Sofya_Ghazaryan.Task_Pizza.model.Order;
import homework_5.Sofya_Ghazaryan.Task_Pizza.model.Pizza;
import homework_5.Sofya_Ghazaryan.Task_Pizza.model.Type;

public class Pizza_Test {

    private static CustomerImpl customer = new CustomerImpl();
    private static OrderImpl order = new OrderImpl();
    private static PizzaImpl pizza = new PizzaImpl();

    public static void main(String[] args) {
        Customer customer = new Customer("Ani");

        Pizza_Test.customer.add(customer);
        Order order1 = new Order(customer);
        order.addOrder(order1);


        Pizza margarita = new Pizza("Margarita", Type.REGULAR, 1, customer);
        margarita.addIngredient("Tomato paste");
        margarita.addIngredient("Garlic");
        margarita.addIngredient("Bacon");
        margarita.addIngredient("Pepperoni");


        Pizza pizza2 = new Pizza("Mar", Type.REGULAR, 1, customer);
        pizza2.addIngredient("Tomato paste");
        pizza2.addIngredient("Olives");
        pizza2.addIngredient("Bacon");
        pizza2.addIngredient("Pepperoni");
        pizza2.addIngredient("Corn");

        order.addPizza(margarita);
        order.addPizza(pizza2);

        order.printCheck(order1);
        order.showPizzaAttributes(order1);
    }
}
