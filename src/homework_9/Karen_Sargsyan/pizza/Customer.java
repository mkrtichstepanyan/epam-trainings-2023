package homework_9.Karen_Sargsyan.pizza;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private int customerNumber;
    private String customerName;
    private String phoneNumber;

    Customer(String name, String phoneNumber) {
        this.customerName = name;
        this.phoneNumber = phoneNumber;
        customerNumber = initialId++;
    }

    public int getNumber() {
        return customerNumber;
    }

    public String getName() {
        return customerName;
    }

}
