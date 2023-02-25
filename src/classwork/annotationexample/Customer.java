package classwork.annotationexample;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    @MinValue(1001)
    private int customerNumber;
    private String customerName;
    private String phoneNumber;

    Customer(int customerNumber) {
     this.customerNumber = customerNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
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
