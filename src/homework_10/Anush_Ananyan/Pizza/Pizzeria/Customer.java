package homework_10.Anush_Ananyan.Pizza.Pizzeria;

import homework_10.Anush_Ananyan.Pizza.Exceptions.CustomerNameException;
import homework_10.Anush_Ananyan.Pizza.Exceptions.PhoneNumberException;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private int customerNumber;
    private String customerName;
    private String phoneNumber;

    Customer() {
        customerNumber = initialId++;
    }

    public void setName(String customerName) throws CustomerNameException {
        if (customerName.matches("[A-Z][a-z]+") && customerName.length() <= 10) {
            this.customerName = customerName;
        } else {
            throw new CustomerNameException();
        }
    }
    public void setPhoneNumber(String phoneNumber) throws PhoneNumberException {
        if (phoneNumber.length()== 12){
            this.phoneNumber = phoneNumber;
        } else throw new PhoneNumberException();

    }

    public int getNumber() {
        return customerNumber;
    }

    public String getName() {
        return customerName;
    }
}
