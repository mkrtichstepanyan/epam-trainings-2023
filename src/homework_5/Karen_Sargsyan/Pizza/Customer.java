package homework_5.Karen_Sargsyan.Pizza;

public class Customer {
    private static int customerNumber = 1000;
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerNumber() {
        return customerNumber++;
    }

    public String getCustomerName() {
        return customerName;
    }
}
