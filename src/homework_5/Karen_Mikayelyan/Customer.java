package homework_5.Karen_Mikayelyan;

public class Customer {
    private final String name;
    private final int number;


    public Customer(String name, int number) {
        this.name = name;
        this.number = addCustomerNumber();
    }

    private int addCustomerNumber() {
        double n = Math.random() * 1000;
        return (int) n;
    }

    public String getName() {
        return name;
    }


    public int getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

}
