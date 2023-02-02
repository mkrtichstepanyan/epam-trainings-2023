package homework_5.Alina_Mkhoyan.pizza;

public class Customer {
    private int customerNumber;
    private String name;
    public Customer(String name) {

        this.customerNumber = (int) (1000 + (Math.random() * 1000));
        if (name.isBlank()) {
            this.name = "Customer_name_" + customerNumber;
        } else {
            this.name = name;
        }
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getName() {
        return name;
    }
}
