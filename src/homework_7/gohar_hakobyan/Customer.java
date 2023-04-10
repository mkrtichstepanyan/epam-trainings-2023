package homework_7.gohar_hakobyan;

import homework_7.gohar_hakobyan.exception.NameFormatException;
import homework_7.gohar_hakobyan.exception.PhoneNumberFormatException;

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
        if (customerName.matches("^[A-Z][a-z]+$]")) {
            this.customerName = customerName;
        } else throw new NameFormatException();
    }

    public void setPhoneNumber(String phoneNumber) throws PhoneNumberFormatException {
        if ((phoneNumber.contains("^\\+374\\d{8}$"))) {
            this.phoneNumber = phoneNumber;
        }
        throw new PhoneNumberFormatException();
    }

    public int getNumber() {
        return customerNumber;
    }

    public String getName() {
        return customerName;
    }
}
