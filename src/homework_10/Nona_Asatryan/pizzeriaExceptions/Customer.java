package homework_10.Nona_Asatryan.pizzeriaExceptions;

import homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions.InvalidNameException;
import homework_10.Nona_Asatryan.pizzeriaExceptions.customExceptions.InvalidPhoneNumberException;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private int customerNumber;
    private String customerName;
    private String phoneNumber;

    Customer() {
        customerNumber = initialId++;
    }

    public void setName(String customerName) throws InvalidNameException {
        if (customerName.matches("[A-Z][a-z]+")) {
            this.customerName = customerName;
        } else {
            throw new InvalidNameException();
        }
    }

    public void setPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (phoneNumber.length() < 11) {
            throw new InvalidPhoneNumberException();
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
}
