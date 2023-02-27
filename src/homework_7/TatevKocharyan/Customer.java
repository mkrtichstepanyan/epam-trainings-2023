package homework_7.TatevKocharyan;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;
    private int customerNumber;

    private String customerName;
    private String phoneNumber;


    Customer() {
        customerNumber = initialId++;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
