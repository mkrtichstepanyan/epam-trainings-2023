package homework_5.gohar_hakobyan.pizzeria;

public class Customer {
    private String name;
    private String customerPhone;

    public Customer(String name, String customerPhone) {
        this.name = name;
        this.customerPhone = customerPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

}
