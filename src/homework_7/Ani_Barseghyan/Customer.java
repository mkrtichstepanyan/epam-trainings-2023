package homework_7.Ani_Barseghyan;

import homework_7.Ani_Barseghyan.exceptions.NameException;
import homework_7.Ani_Barseghyan.exceptions.PhoneNumberException;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialID = BASE_CUSTOMER_NUMBER;
    private int customerNumber;
    private String customerName;
    private String phoneNumber;

    Customer() {
        customerNumber = initialID++;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        if (customerName.matches("[A-Z][a-z]+")) {
            this.customerName = customerName;
        } else throw new NameException();


    }

    public void setPhoneNumber(String phoneNumber) throws PhoneNumberException {
        if (phoneNumber.length() < 11) {
            throw new PhoneNumberException();
        } else this.phoneNumber = phoneNumber;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
}
