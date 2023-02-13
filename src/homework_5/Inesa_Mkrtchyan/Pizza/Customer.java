package homework_5.Inesa_Mkrtchyan.Pizza;

public class Customer {
    private final int CustomerId;
    private String name;

    public Customer(String name) {
        CustomerId = Helper.rand.nextInt(10000,99999);
        this.name = name;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
