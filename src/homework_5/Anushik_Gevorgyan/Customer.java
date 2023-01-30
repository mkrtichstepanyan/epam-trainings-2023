package homework_5.Anushik_Gevorgyan;

public class Customer {
    private String name;
    private int customerNumber;

    public Customer(String name, int customerNumber) {
        this.name = name;
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
}
