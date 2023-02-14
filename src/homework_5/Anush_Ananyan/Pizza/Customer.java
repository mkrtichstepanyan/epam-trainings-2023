package homework_5.Anush_Ananyan.Pizza;

public class Customer {
    private String customerName;
    private final int CUSTOMER_NUMBER = (int) (Math.random() * 10000);

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCostumerNumber() {
        return CUSTOMER_NUMBER;
    }

}
