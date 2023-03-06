package homework_7.Varsik_Pijoyan;

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
        if (customerName.matches("[A-Z][a-z]+")) {
            this.customerName = customerName;
        }else throw new NameException();
    }

    public void setPhoneNumber(String phoneNumber) throws PhoneNumberException {
        if (phoneNumber.length() < 11){
            throw new PhoneNumberException();
        }else this.phoneNumber = phoneNumber;
    }

    public int getNumber() {
        return customerNumber;
    }

    public String getName() {
        return customerName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}
