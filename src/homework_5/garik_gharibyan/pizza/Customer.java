package homework_5.garik_gharibyan.pizza;

public class Customer {
    private String name;

    private int phoneNumber;

    public Customer(String name,int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
