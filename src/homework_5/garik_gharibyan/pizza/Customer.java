package homework_5.garik_gharibyan.pizza;

public class Customer {
    private final String name;
    private final int number;

    public Customer(String name,int phoneNumber){
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
