package homework_5.Roza_Petrosyan.pizza;

import java.util.Random;

public class Customer {
    private final String CUSTOMER_NAME;
    private final int CUSTOMER_NUMBER = ((1 + new Random(System.currentTimeMillis()).nextInt(9)) * 1000
            + new Random(System.currentTimeMillis()).nextInt(1000));

    public Customer(String customerName) {
        CUSTOMER_NAME = customerName;
    }

    public String getCustomerName() {
        return CUSTOMER_NAME;
    }

    public int getCustomerNumber() {
        return CUSTOMER_NUMBER;
    }
}
