package homework_5.garik_gharibyan.pizza;

public class Order {
    private static int lastOrderNumber = 10000;
    private final int orderNumber;
    private double totalAmount = 0;
    private final Pizza[] pizzas;


    private Order(Pizza[] pizzas, int orderNumber) {

        this.pizzas = pizzas;
        this.orderNumber = orderNumber;
    }


    public int getOrderNumber() {
        return orderNumber;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public static Order makeOrder(Pizza[] pizzas) {
        return new Order(pizzas, lastOrderNumber++);
    }

    public void pizzaAttributes() {
        System.out.println(
                "Order: " + orderNumber + "\n" +
                        "Customer number: " + pizzas[0].getCustomer().getNumber() + "\n" +
                        "Pizza name: " + pizzas[0].getName() + "\n" +
                        "Quantity: " + pizzas[0].getQuantity() + "\n"
        );
    }

    public void printCheck() {

        System.out.println(
                "**************************************" + "\n" +
                        "Order: " + getOrderNumber() + "\n" +
                        "Client: " + pizzas[0].getCustomer().getNumber());

        for (Pizza pizza : pizzas) {
            System.out.println(
                    "Name: " + pizza.getName() + "\n" +
                            "---------------------------" + "\n" +
                            "Pizza base: " + pizza.getPizzaType().getPizzaTypeName() + " " +
                            pizza.getPizzaType().getPizzaTypePrice());

            pizza.printIngredients();
            System.out.println(
                    "---------------------------" + "\n" +
                            "Amount: " + pizza.pizzaAmount() + "\n" +
                            "Quantity: " + pizza.getQuantity() + "\n" +
                            "---------------------------");
        }
        System.out.println("Total Amount: " + getTotalAmount() + "\n" +
                "**************************************\n\n");
    }
    double getTotalAmount() {
        for (Pizza pizza : pizzas) {
            totalAmount = pizza.pizzaAmount() * pizza.getQuantity() + totalAmount;
        }
        return totalAmount;
    }
}
