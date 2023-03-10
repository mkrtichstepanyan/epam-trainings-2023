package homework_10.Yeghia_Ansuryan.Palmetto.customer;

import homework_10.Yeghia_Ansuryan.Palmetto.exceptions.LatinNameException;
import homework_10.Yeghia_Ansuryan.Palmetto.exceptions.PhoneNumberException;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private int customerNumber;
    private String customerName;
    private String phoneNumber;

   public Customer() {
        customerNumber = initialId++;
    }

    public void setName(String customerName) {
        if (!customerName.matches("[A-Z][a-z]+[\s][A-Z][a-z]+")) {
            throw new LatinNameException();

        }
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.charAt(0) != '+') {
            throw new PhoneNumberException();

        }
        this.phoneNumber = phoneNumber;
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
