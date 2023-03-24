package homework_10.anna_manukyan.pizzeria;

import homework_10.anna_manukyan.pizzeria.CustomExceptions.PhoneNumberException;
import homework_10.anna_manukyan.pizzeria.annotations.NotNull;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private int customerNumber;
    private String customerName;

    @NotNull
    private String phoneNumber;

    Customer() {
        customerNumber = initialId++;
    }

    public void setName(String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) throws PhoneNumberException {
        if (phoneNumber.length() < 11) {
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
}
