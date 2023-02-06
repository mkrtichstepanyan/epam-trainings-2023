package homework_5.Alina_Mkhoyan.pizzeria;

public class Customer {

    private int customerNumber;
    private String name;

    public Customer(String name) {
        this.name = name;
        this.customerNumber = getRandomId(1000, 9999);
    }

    public static Customer addCustomer(String name) {
        return new Customer(name);

    }

    public int getRandomId(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getName() {
        return name;
    }

}

