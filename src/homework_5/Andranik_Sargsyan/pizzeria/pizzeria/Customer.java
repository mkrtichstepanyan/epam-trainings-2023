package homework_5.Andranik_Sargsyan.pizzeria.pizzeria;

public class Customer {
    private int clientNumber;
    private String name;
    private String phoneNumber;

    public Customer(String name, String phoneNumber) {
        this.name = name;
        // this.phoneNumber = phoneNumber;
        this.clientNumber = getRandomId(10000, 100);
    }

    public int getRandomId(int max, int min) {
        return (int) ((Math.random() * (max - min)));
    }

    public static Customer addCustomer(String name, String phoneNumber) {
        return new Customer(name, phoneNumber);
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
