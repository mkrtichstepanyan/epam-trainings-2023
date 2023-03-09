package homework_7.ofelya_khachatryan;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;
    private static final String REGEX_NAME = "[A-Z]+([ '-][a-zA-Z]+)*";

    private int customerNumber;
    private String customerName;
    private String phoneNumber;

    Customer() {
        customerNumber = initialId++;
    }

    public void setName(String customerName) {
        if (customerName.matches(REGEX_NAME)) {
            this.customerName = customerName;
        } else {
            throw new MyNameException();
        }
    }

    public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getNumber() {
        return customerNumber;
    }

    public String getName() {
        return customerName;
    }
}
