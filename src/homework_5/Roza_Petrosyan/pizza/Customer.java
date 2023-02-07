package homework_5.Roza_Petrosyan.pizza;

public class Customer {
    private String customerName;
    private final int customerNumber;

    public Customer(String customerName, int customerNumber) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
}
