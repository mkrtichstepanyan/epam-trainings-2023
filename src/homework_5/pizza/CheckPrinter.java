package homework_5.pizza;


public class CheckPrinter {
    private PizzaType pizzaType;
    private Pizza pizza;
    private Order order;
    private Customer customer;

    private OrderItem orderItem;


    public CheckPrinter(PizzaType pizzaType, Pizza pizza, Order order, Customer customer,OrderItem orderItem) {
        this.pizzaType = pizzaType;
        this.pizza = pizza;
        this.order = order;
        this.customer = customer;
        this.orderItem = orderItem;
    }

    public void displayAttributes() {
        System.out.println("Order date: Order: Customer: Name: Quantity");
        System.out.println("Order date " + order.getTime() + ":" +
                order.getOrderNumber() + ":" + customer.getCustomerNumber() +
                ":" + pizza.getName() + ":" + pizza.getQuantity() + "]");
    }

    public void printReceipt() {
        System.out.println("*********************");
        System.out.println("Order date: " + order.getTime() + "\n" +
                "Order: " + order.getOrderNumber() + "\n" +
                "Client: " + customer.getCustomerNumber() + "\n" +
                "Name: " + pizza.getName());
        System.out.println("--------------------");
        System.out.println("Pizza Base: " + pizzaType.getType() + " " + pizzaType.getPrice() + " $");
        for (Ingredients ingredient : pizza.getIngredients()) {
            if (ingredient == null) {
                break;
            } else {
                System.out.print(ingredient.getName() + " " + ingredient.getPrice() + " $" + "\n");
            }
        }
        System.out.println("--------------------");
        System.out.println("Amount: " + pizza.calculatePrice() + " $");
        System.out.println("Quantity: " + pizza.getQuantity()+" things");
        System.out.println("--------------------");
        System.out.println("Total Amount: " + (float) (pizza.calculatePrice() * pizza.getQuantity()) + " $");

    }
}
