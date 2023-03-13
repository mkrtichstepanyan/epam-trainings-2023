package homework_10.robert_nazaryan.exceptionsHomework;

import homework_10.robert_nazaryan.exceptionsHomework.exceptions.InvalidNameException;
import homework_10.robert_nazaryan.exceptionsHomework.exceptions.InvalidPhoneNumberException;

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
        } else {
            throw new InvalidNameException();
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.matches("[+][374][0-9]+") && phoneNumber.length() == 12){
            this.phoneNumber = phoneNumber;
        } else {
            throw new InvalidPhoneNumberException();
        }
    }

    public int getNumber() {
        return customerNumber;
    }

    public String getName() {
        return customerName;
    }

}
