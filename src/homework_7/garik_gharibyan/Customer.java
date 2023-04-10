package homework_7.garik_gharibyan;

import homework_7.garik_gharibyan.exceptions.CustomerNumberException;
import homework_7.garik_gharibyan.exceptions.NameException;
import homework_7.garik_gharibyan.exceptions.PhoneNumberException;

public class Customer {

    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private String name;
    private String phoneNumber;
    private final int number;

    Customer(){
        if (initialId < 9999 || initialId > 999){
            number = initialId++;
        }else {
            throw new CustomerNumberException();
        }

    }


    public int getNumber() {
        return number;
    }

    public void setName(String name) throws NameException {
        if (name.matches("[A-Z][a-z]+")){
            this.name = name;
        }else {
            throw new NameException();
        }

    }
    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber)throws PhoneNumberException {
        if (phoneNumber.matches("[+]374(98|77)[0-9]{6}")){
            this.phoneNumber = phoneNumber;
        }else {
            throw new PhoneNumberException();
        }

    }
    public String getPhoneNumber() {
        return phoneNumber;
    }


}
