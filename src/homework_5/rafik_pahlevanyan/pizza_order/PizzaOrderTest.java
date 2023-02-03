package homework_5.rafik_pahlevanyan.pizza_order;


import homework_5.rafik_pahlevanyan.pizza_order.model.Customer;
import homework_5.rafik_pahlevanyan.pizza_order.model.Order;
import homework_5.rafik_pahlevanyan.pizza_order.model.Pizza;
import homework_5.rafik_pahlevanyan.pizza_order.model.PizzaType;

public class PizzaOrderTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Customer Name");
        Customer customer1 = new Customer("USER Name");
        Order order = new Order(customer1);
        Pizza margar = new Pizza("Margarita", PizzaType.CLOSED, 1);
        margar.addIngredient("Tomato paste");
        margar.addIngredient("Pepperoni");
        margar.addIngredient("Garlic");
        margar.addIngredient("Bacon");
        order.addPizza(margar);
        order.printCheck();
        Order order1 = new Order(customer);
        Pizza margarita = new Pizza("Margarita", PizzaType.CLOSED, 5);
        margarita.addIngredient("Tomato paste");
        margarita.addIngredient("Pepperoni");
        margarita.addIngredient("Garlic");
        margarita.addIngredient("Bacon");
        order1.addPizza(margarita);
        Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.REGULAR, 1);
        pepperoniOro.addIngredient("Garlic");
        pepperoniOro.addIngredient("Corn");
        pepperoniOro.addIngredient("Pepperoni");
        pepperoniOro.addIngredient("Olives");
        order1.addPizza(pepperoniOro);
        Pizza pepper = new Pizza("asd", PizzaType.CLOSED, 1);
        pepper.addIngredient("Cheese");
        pepper.addIngredient("Olives");
        pepper.addIngredient("Corn");
        pepper.addIngredient("Corn");
        order1.addPizza(pepper);
        order1.printCheck();

        order1.displayPizzaAttributes();
        order.displayPizzaAttributes();



    }
}