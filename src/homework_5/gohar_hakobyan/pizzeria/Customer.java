package homework_5.gohar_hakobyan.pizzeria;

public class Customer {
    private String name;
    private String customerPhone;

    public Customer(String name) {
        this.name = name;
        this.customerPhone = String.valueOf(addRandomNumber());
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

    public int addRandomNumber() {
        int customerNumber = (int) (Math.random() * 100000);
        return customerNumber;
    }

}
