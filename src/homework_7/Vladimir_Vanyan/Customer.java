package homework_7.Vladimir_Vanyan;

public class Customer {
    private static final int BASE_CUSTOMER_NUMBER = 1000;
    private static int initialId = BASE_CUSTOMER_NUMBER;

    private String name;
    private String phoneNumber;
    private final int number;

    Customer() {
        number = initialId++;
    }


    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

}
