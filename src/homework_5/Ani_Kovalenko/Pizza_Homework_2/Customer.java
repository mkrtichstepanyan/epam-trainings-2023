package homework_5.Ani_Kovalenko.Pizza_Homework_2;

public class Customer {
    private static int customerId = 10000;
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public int getId() {
        return customerId++;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.customerId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int generateId() {
        return this.customerId + 1;
    }
}
