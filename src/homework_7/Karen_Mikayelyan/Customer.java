package homework_7.Karen_Mikayelyan;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private int customerNumber;
    private String customerName;
    private String phoneNumber;

    Customer() {
        customerNumber = initialId++;
    }

    public void setName(String customerName) {
        if (customerName.matches("[A-Z][a-z]+")) {
            this.customerName = customerName;
        } else throw new InvalidNameException();
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("^\\+\\d{11}$")) {
            this.phoneNumber = phoneNumber;
        } else throw new InvalidPhoneNumberException();
    }

    public int getNumber() {

        return customerNumber;
    }

    public String getName() {

        return customerName;
    }
}
