package homework_5.Roza_Petrosyan.pizza;

import java.util.Random;

public class Customer {
    private final String CUSTOMER_NAME;
    private final int customerNumber = ((1 + new Random(System.currentTimeMillis()).nextInt(2)) * 1000
            + new Random(System.currentTimeMillis()).nextInt(1000));

    public Customer(String customerName) {
        CUSTOMER_NAME = customerName;
    }

    public String getCustomerName() {
        return CUSTOMER_NAME;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
}
