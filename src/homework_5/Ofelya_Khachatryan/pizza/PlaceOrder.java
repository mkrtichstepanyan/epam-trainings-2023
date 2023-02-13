package homework_5.Ofelya_Khachatryan.pizza;

import java.time.LocalTime;
import java.util.Arrays;

public class PlaceOrder {

    private int orderNumber;
    private int customerNumber ;
    private Pizza [] pizzas;
    private LocalTime localTime;

    public PlaceOrder(int orderNumber, int customerNumber, Pizza[] pizzas, LocalTime localTime) {
        this.orderNumber = orderNumber;
        this.customerNumber = customerNumber;
        this.pizzas = pizzas;
        this.localTime = localTime;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Pizza[] getPizzas() {
        return pizzas;
    }

    public void setPizzas(Pizza[] pizzas) {
        this.pizzas = pizzas;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    @Override
    public String toString() {
        return "PlaceOrder{" +
                "orderNumber=" + orderNumber +
                ", customerNumber=" + customerNumber +
                ", pizzas=" + Arrays.toString(pizzas) +
                ", localTime=" + localTime +
                '}';
    }
}
