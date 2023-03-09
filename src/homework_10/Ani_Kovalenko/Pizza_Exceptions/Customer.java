package homework_10.Ani_Kovalenko.Pizza_Exceptions;

import homework_10.Ani_Kovalenko.Pizza_Exceptions.MyExceptions.LatinNameException;
import homework_10.Ani_Kovalenko.Pizza_Exceptions.MyExceptions.PhoneNumberException;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private int customerNumber;
    private String customerName;
    private String countryCode;
    private String phoneNumber;

    Customer(String name, String countryCode, String phoneNumber) throws PhoneNumberException, LatinNameException {
        if (phoneNumber.length() != 8) {
            throw new PhoneNumberException();
        } else {
            this.phoneNumber = phoneNumber;
        }
        if (!name.matches("[A-Z][a-z]+")) {
            throw new LatinNameException();
        } else {
            this.customerName = name;
        }
        if (!isValidCountryCode(countryCode)) {
            throw new PhoneNumberException();
        } else {
            this.countryCode = countryCode;
        }
        customerNumber = initialId++;
    }

    private boolean isValidCountryCode(String countryCode) {
        for (int i = 0; i < CountryCodes.values().length; i++) {
            if (countryCode.equals(CountryCodes.values()[i].getCode())) {
                return true;
            }
        }
        return false;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getNumber() {
        return customerNumber;
    }

    public String getName() {
        return customerName;
    }
}
