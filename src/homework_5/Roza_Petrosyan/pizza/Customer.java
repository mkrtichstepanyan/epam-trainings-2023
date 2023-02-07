package homework_5.Roza_Petrosyan.pizza;

import java.util.Random;

public class Customer {
    private String customerName;
    private final int customerNumber = ((1 + new Random(System.currentTimeMillis()).nextInt(2)) * 1000
            + new Random(System.currentTimeMillis()).nextInt(1000));

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
}
