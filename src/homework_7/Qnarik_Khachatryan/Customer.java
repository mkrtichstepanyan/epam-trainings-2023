package homework_7.Qnarik_Khachatryan;

import homework_7.Qnarik_Khachatryan.exceptions.NameException;
import homework_7.Qnarik_Khachatryan.exceptions.PhoneNumberException;

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
        if (!customerName.matches("[A-Z][a-z]+")) {
            throw new NameException();

        } else {
            this.customerName = customerName;
        }
    }

    public void setPhoneNumber(String phoneNumber) throws PhoneNumberException {
        if (phoneNumber.length() < 11 | phoneNumber.matches("[A-Z][a-z]")){
            throw new PhoneNumberException();
        } else{
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
