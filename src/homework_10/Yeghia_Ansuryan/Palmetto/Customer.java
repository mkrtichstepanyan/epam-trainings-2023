package homework_10.Yeghia_Ansuryan.Palmetto;

import homework_10.Yeghia_Ansuryan.Palmetto.myExceptions.LatinNameException;
import homework_10.Yeghia_Ansuryan.Palmetto.myExceptions.PhoneNumberException;

import javax.swing.text.StyleConstants;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private int customerNumber;
    private String customerName;
    private String phoneNumber;

    Customer() {
        customerNumber = initialId++;
    }

    public void setName(String customerName) throws LatinNameException {
        if (!customerName.matches("[A-Z][a-z]+[\s][A-Z][a-z]+")) {
            throw new LatinNameException();
        } else {
            this.customerName = customerName;
        }
    }

    public void setPhoneNumber(String phoneNumber) throws PhoneNumberException {
        if (phoneNumber.charAt(0) != '+') {
            throw new PhoneNumberException();
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    public int getNumber() {
        return customerNumber;
    }

    public String getName() {
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
