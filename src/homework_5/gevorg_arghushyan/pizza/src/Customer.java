package homework_5.gevorg_arghushyan.pizza.src;

public class Customer {

    private String name;
    private static int counter = 1000;
    private int customerNumber;

    public Customer(int customerNumber, String name) {
        this.customerNumber = counter++;
    }


    public int getCustomerNumber() {
        return customerNumber;
    }


    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Customer() {
        this.customerNumber = counter++;
    }


}
