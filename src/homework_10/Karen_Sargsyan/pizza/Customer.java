package homework_10.Karen_Sargsyan.pizza;

import homework_10.Karen_Sargsyan.pizza.myException.LatinNameException;
import homework_10.Karen_Sargsyan.pizza.myException.PhoneNumberException;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private int customerNumber;
    private String customerName;
    private String phoneNumber;

    Customer(String name, String phoneNumber) {
        if (!name.matches("[A-Z][a-z]+[\s][A-Z][a-z]+")){
            throw new LatinNameException();
        } else {
            this.customerName = name;
        }
        if (!phoneNumber.substring(0, 4).equals("+374") | phoneNumber.length() != 12) {
            throw new PhoneNumberException();
        } else {
            this.phoneNumber = phoneNumber;
        }
        customerNumber = initialId++;
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
