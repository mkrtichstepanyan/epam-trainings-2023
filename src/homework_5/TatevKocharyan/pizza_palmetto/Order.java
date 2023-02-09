package homework_5.TatevKocharyan.pizza_palmetto;

import java.util.Objects;

public class Order {
    Pizza pizza;
    int orderNumber;
    Customer customer;
    long localTime = System.currentTimeMillis();

    public Order(Customer customer, Pizza pizza) {
        this.customer = customer;
        this.pizza = pizza;
        this.orderNumber = (int) (Math.random() * 10);
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
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

    public long getLocalTime() {
        return localTime;
    }

    public void setLocalTime(long localTime) {
        this.localTime = localTime;
    }

    void printCheck() {
        System.out.println("********************************\n"
                + "Order Number: " + orderNumber + "\n"
                + "Customer Number: " + customer.getNumber() + "\n"
                + "Pizza Name: " + pizza.getPizzaName() + "\n"
                + "---------------------------------\n"
                + "Pizza Base: " + pizza.getType()
        );
        double baseType;
        if (pizza.getType().equals("Closed")) {
            baseType = 1.50;
        } else {
            baseType = 1;
        }
        double amout = baseType;


        if (pizza.getTomatoPaste() != null) {
            amout = amout + 1;
        } else {
            amout = amout + 0;
        }


        if (pizza.getCheese() != (null)) {
            amout = amout + 1;
        } else {
            amout = amout + 0;
        }


        if (pizza.getSalami() != null) {
            amout = amout + 1.5;
        } else {
            amout = amout + 0;
        }

        if (pizza.getBacon() != null) {
            amout = amout + 1.2;
        } else {
            amout = amout + 0;
        }

        if (pizza.getGarlic() != null) {
            amout = amout + 0.3;
        } else {
            amout = amout + 0;
        }

        if (pizza.getCorn() != null) {
            amout = amout + 0.7;
        } else {
            amout = amout + 0;
        }

        if (pizza.getPepperoni() != null) {
            amout = amout + 0.6;
        } else {
            amout = amout + 0;
        }

        if (pizza.getOlives() != null) {
            amout = (amout + 0.5);
        } else {
            amout = amout + 0;
        }

        if (pizza.getPepper() != null) {
            amout = amout + 0.5;
        } else {
            amout = amout + 0;
        }
        System.out.println("Amout: " + amout * pizza.count);
        System.out.println("Quantity: " + pizza.count);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return localTime == order.localTime && Objects.equals(pizza, order.pizza) && Objects.equals(customer, order.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizza, orderNumber, customer, localTime);
    }

    @Override
    public String toString() {
        return "Order{" +
                "pizza=" + pizza +
                ", orderNumber=" + orderNumber +
                ", customer=" + customer +
                ", localTime=" + localTime +
                '}';
    }
}
