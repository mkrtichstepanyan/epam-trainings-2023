package homework_7.Hovhannes_Gspeyan.palmetto;

import homework_7.Hovhannes_Gspeyan.palmetto.exception.Error;
import homework_7.Hovhannes_Gspeyan.palmetto.exception.InvalidNameException;
import homework_7.Hovhannes_Gspeyan.palmetto.exception.InvalidPhoneNumberException;


import static homework_7.Hovhannes_Gspeyan.palmetto.exception.Error.INVALID_NAME;
import static homework_7.Hovhannes_Gspeyan.palmetto.exception.Error.INVALID_PHONE_NUMBER;

public class Customer {

    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private final int customerNumber;
    private String customerName;
    private String phoneNumber;

    public Customer() {
        customerNumber = initialId++;
    }

    public void setName(String customerName) {
        if(customerName.matches("[A-z][a-z]+")){
            this.customerName = customerName;
        }else {
            throw new InvalidNameException(INVALID_NAME);
        }
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.matches("^\\+\\d{11}$")){
            this.phoneNumber = phoneNumber;
        }else {
            throw new InvalidPhoneNumberException(INVALID_PHONE_NUMBER);
        }

    }

    public int getNumber() {
        return customerNumber;
    }

    public String getName() {
        return customerName;
    }
}
