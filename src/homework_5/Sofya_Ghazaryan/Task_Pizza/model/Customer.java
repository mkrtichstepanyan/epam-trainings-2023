package homework_5.Sofya_Ghazaryan.Task_Pizza.model;

public class Customer {
    private String name;
    private int customerNumber;

    public Customer() {
    }

    public Customer(String name) {
        this.name = name;
        this.customerNumber = addCustomerNumber();
    }

    private int addCustomerNumber() {
        int i = (int) (Math.random() * 100000);
        return i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerNumber=" + customerNumber +
                '}';
    }
}
