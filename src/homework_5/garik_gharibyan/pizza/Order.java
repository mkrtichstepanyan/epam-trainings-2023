package homework_5.garik_gharibyan.pizza;

public class Order {
    private static int lastOrderNumber = 10000;
    private final int orderNumber;

    private final Pizza[] pizzas;
    private final Customer customer;


    private Order(Pizza[] pizzas, Customer customer, int orderNumber) {

        this.pizzas = pizzas;
        this.customer = customer;
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void getInfo() {
        System.out.println(
                "Order: " + orderNumber + "\n" +
                        "Customer phone number: " + customer.getPhoneNumber() + "\n" +
                        "Pizza name: " + pizzas[0].getName() + "\n" +
                        "Quantity: " + pizzas[0].getQuantity() + "\n"
        );
    }

    public static Order makeOrder(Pizza[] pizzas, Customer customer) {
        return new Order(pizzas, customer, lastOrderNumber++);
    }

//    public void printCheck() {
//
//        System.out.println(
//                "**************************************" + "\n" +
//                        "Order: " + getOrderNumber() + "\n" +
//                        "Client: " + customer.getPhoneNumber() + "\n" +
//                        "Name: " + pizza.getName() + "\n" +
//                        "---------------------------" + "\n" +
//                        "Pizza base: " + pizza.getPizzaType().getPizzaTypeName() + " " +
//                        pizza.getPizzaType().getPizzaTypePrice());
//        pizza.printIngredients();
//        System.out.println(
//                "---------------------------" + "\n" +
//                        "Amount: " + pizza.pizzaAmount() + "\n" +
//                        "Quantity: " + quantity + "\n");
//
//    }
}
