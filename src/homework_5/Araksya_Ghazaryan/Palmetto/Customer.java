package homework_5.Araksya_Ghazaryan.Palmetto;

public class Customer {
    private String name;
    private int number;

    public Customer(String name) {
        this.name = name;
        this.number = addCustomerNumber();
    }
    private int addCustomerNumber() {
        double custoerNumber = Math.random() * 10000;
        return (int) custoerNumber;
    }
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
}




