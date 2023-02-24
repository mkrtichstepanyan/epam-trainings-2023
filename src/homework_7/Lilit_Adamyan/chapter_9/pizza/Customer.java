package homework_7.Lilit_Adamyan.chapter_9.pizza;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private int customerNumber;
    private String customerName;
    private String phoneNumber;

    Customer(String name) {
        this.customerNumber = initialId++;
        this.customerName=name;
    }

    public void setName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return customerNumber;
    }

    public String getName() {
        return customerName;
    }
}
