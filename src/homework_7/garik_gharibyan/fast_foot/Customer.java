package homework_7.garik_gharibyan.fast_foot;

public class Customer {
    private final String name;
    private final int number;

    public Customer(String name, int phoneNumber) {
        this.name = name;
        this.number = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
