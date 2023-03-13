package homework_7.Roza_Petrosyan;

import homework_7.Roza_Petrosyan.exceptions.customer_exceptions.CustomerNameException;
import homework_7.Roza_Petrosyan.exceptions.customer_exceptions.PhoneNumberException;

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
        validateCustomerName(customerName);
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return customerNumber;
    }

    public String getName() {
        return customerName;
    }

    private void validateCustomerName(String customerName) {
        if (customerName != null) {
            if (!customerName.matches("[A-Z][a-z]+")) {
                throw new CustomerNameException();
            }
        }
    }

    private void validatePhoneNumber(String phoneNumber) {
        if (phoneNumber != null) {
            if (!phoneNumber.matches("^\\+?3?7?(4[5-9][0-9]\\d{6})$")) {
                throw new PhoneNumberException();
            }
        }
    }

}
