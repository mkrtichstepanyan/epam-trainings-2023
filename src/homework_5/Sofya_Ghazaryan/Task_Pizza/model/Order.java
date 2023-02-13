package homework_5.Sofya_Ghazaryan.Task_Pizza.model;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNumber;
    private Customer customer;
    private List<Pizza> pizzaList;
    private int pizzaQuantity;
    private LocalDateTime orderTime;

    public Order() {
    }


    public Order(Customer customer) {
        this.orderNumber = (int) (Math.random() * 100000);
        this.customer = customer;
        this.pizzaList = new ArrayList<>();
        this.orderTime = LocalDateTime.now();
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

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public int getPizzaQuantity() {
        return pizzaQuantity;
    }

    public void setPizzaQuantity(int pizzaQuantity) {
        this.pizzaQuantity = pizzaQuantity;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
//                ", customer=" + customer +
                ", pizzas=" + pizzaList +
                ", pizzaQuantity=" + pizzaQuantity +
                ", orderTime=" + orderTime +
                '}';
    }
}
