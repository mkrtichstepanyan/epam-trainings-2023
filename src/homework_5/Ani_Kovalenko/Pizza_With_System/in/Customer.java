package homework_5.Ani_Kovalenko.Pizza_With_System.in;

public class Customer {
    private static int customerId = 5001;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public int getCustomerId() {
        return customerId++;
    }

    public String getName() {
        return name;
    }

    public void setCustomerId(int id) {
        this.customerId = id;
    }
    public void setName(String name) {
        this.name = name;
    }

}
