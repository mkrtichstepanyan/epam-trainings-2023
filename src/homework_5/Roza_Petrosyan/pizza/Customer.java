package homework_5.Roza_Petrosyan.pizza;

public class Customer {
    private String customer_name;
    private final int customer_number;

    public Customer(String customer_name, int customer_number) {
        this.customer_number = customer_number;
        this.customer_name = customer_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public int getCustomer_number() {
        return customer_number;
    }
}
