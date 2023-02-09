package homework_5.TatevKocharyan.pizza_palmetto;

public class PizzaTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Tom", 1);
        Customer customer2 = new Customer("Tomi", 2);
        Pizza pizza = new Pizza("Margarita", "Closed", 5);
        pizza.makeMargarita();
        Order order = new Order(customer, pizza);
        Order order1 = new Order(customer2, pizza);
        System.out.println(order);
        System.out.println(order1);
        order.printCheck();
        order1.printCheck();
    }
}
