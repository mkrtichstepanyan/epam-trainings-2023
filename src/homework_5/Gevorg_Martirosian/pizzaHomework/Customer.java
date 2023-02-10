package homework_5.Gevorg_Martirosian.pizzaHomework;

public class Customer {
    public String name;
    public String surname;
    private final int customerNumber = (int)(Math.random() * 9000) + 1000;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
