package homework_5.rafik_pahlevanyan.pizza_order;


import homework_5.rafik_pahlevanyan.pizza_order.model.Customer;
import homework_5.rafik_pahlevanyan.pizza_order.model.Order;
import homework_5.rafik_pahlevanyan.pizza_order.model.Pizza;
import homework_5.rafik_pahlevanyan.pizza_order.model.PizzaType;

public class PizzaOrderTest {
    public static void main(String[] args) {
        Customer customer = new Customer("John");
        Order order = new Order(customer);
        Pizza margar = new Pizza("Margarita", PizzaType.CLOSED, 1, customer);
        margar.addIngredient("Tomato paste");
        margar.addIngredient("Pepperoni");
        margar.addIngredient("Garlic");
        margar.addIngredient("Bacon");
        order.addPizza(margar);
        order.printCheck();
        order.displayPizzaAttributes();


        Customer customer1 = new Customer("Teddy");
        Order order1 = new Order(customer1);
        Pizza margarita = new Pizza("Margarita", PizzaType.CLOSED, 5, customer1);
        margarita.addIngredient("Tomato paste");
        margarita.addIngredient("Pepperoni");
        margarita.addIngredient("Garlic");
        margarita.addIngredient("Bacon");
        order1.addPizza(margarita);
        Pizza pepperoniOro = new Pizza("PepperoniOro", PizzaType.REGULAR, 1, customer1);
        pepperoniOro.addIngredient("Garlic");
        pepperoniOro.addIngredient("Corn");
        pepperoniOro.addIngredient("Pepperoni");
        pepperoniOro.addIngredient("Olives");
        order1.addPizza(pepperoniOro);
        Pizza pepper = new Pizza("asg", PizzaType.CLOSED, 1, customer1);
        pepper.addIngredient("Cheese");
        pepper.addIngredient("Olives");
        pepper.addIngredient("Corn");
        pepper.addIngredient("Corn");
        order1.addPizza(pepper);
        order1.printCheck();


        order1.displayPizzaAttributes();


    }
}