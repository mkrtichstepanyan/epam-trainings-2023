package homework_5.Hovhannes_Abrahamyan.pizzeria;

import java.util.Arrays;
import java.util.Objects;

public class Order {
    private int orderNumber;
    private Customer customer;
    private Pizza[] pizzas;

    public Order(int orderNumber, Customer customer, Pizza[] orderItems) {
        this.orderNumber = orderNumber;
        this.customer = customer;
        this.pizzas = orderItems;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", customer=" + customer +
                ", orderItems=" + Arrays.toString(pizzas) +
                '}';
    }

    public Order() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderNumber == order.orderNumber && Objects.equals(customer, order.customer) && Arrays.equals(pizzas, order.pizzas);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(orderNumber, customer);
        result = 31 * result + Arrays.hashCode(pizzas);
        return result;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Pizza[] getOrderItems() {
        return pizzas;
    }

    public void setOrderItems(Pizza[] orderItems) {
        this.pizzas = orderItems;
    }
}