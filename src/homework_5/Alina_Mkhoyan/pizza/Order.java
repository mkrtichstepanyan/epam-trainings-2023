package homework_5.Alina_Mkhoyan.pizza;

import java.time.LocalTime;
import java.util.List;

public class Order {
    private static int orderId = 10000;
    private static int customerId = 0;
    private List<Pizza> items;
    private final LocalTime time = LocalTime.now();

    public LocalTime getTime() {
        return time;
    }

    public Order() {
        orderId++;
        customerId++;
    }

    public Order(List<Pizza> items) {
        this.items = items;
        orderId++;
        customerId++;
    }

    public List<Pizza> getItems() {
        return items;
    }

    public static int getOrderId() {
        return orderId;
    }

    public static int getCustomerId() {
        return customerId;
    }

    public void setItems(List<Pizza> items) {
        this.items = items;
    }

    public static void setOrderId(int orderId) {
        Order.orderId = orderId;
    }

    public static void setCustomerId(int customerId) {
        Order.customerId = customerId;
    }


    public void displayPizzaAttributes(Pizza pizza) {
        System.out.println("[" + orderId + ": " + customerId + ": "+
                pizza.getName() + ": " + pizza.getQuantity() + "]");
    }

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                ", time=" + time +
                '}';
    }
}