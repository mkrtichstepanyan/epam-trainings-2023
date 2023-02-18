package homework_5.garik_gharibyan.pizza;

public class Order {
    private static int lastOrderNumber = 10000;
    private final int orderNumber;
    private double totalAmount = 0;
    private final Pizza[] pizzas;
    private final Customer customer;

    private Order(Pizza[] pizzas, int orderNumber, Customer customer) {
        this.pizzas = pizzas;
        this.orderNumber = orderNumber;
        this.customer = customer;
        isValidPizzaName(pizzas);

    }


    public int getOrderNumber() {
        return orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }


    public static Order makeOrder(Pizza[] pizzas, Customer customer) {
        return new Order(pizzas, lastOrderNumber++, customer);
    }

    public void pizzaAttributes() {

        for (Pizza pizza : pizzas) {
            System.out.println(
                    "Order: " + orderNumber + "\n" +
                            "Customer number: " + customer.getNumber() + "\n" +
                            "Pizza name: " + pizza.getName() + "\n" +
                            "Quantity: " + pizza.getQuantity() + "\n"
            );
        }

    }

    double getTotalAmount() {
        for (Pizza pizza : pizzas) {
            totalAmount = pizza.pizzaAmount() * pizza.getQuantity() + totalAmount;
        }
        return totalAmount;
    }

    void isValidPizzaName(Pizza[] pizzas) {
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzas[i].getName() == null || pizzas[i].getName().length() < 4 || pizzas[i].getName().length() > 20) {
                pizzas[i].setName(customer.getName() + "_" + customer.getNumber());
            }
        }
    }


}
