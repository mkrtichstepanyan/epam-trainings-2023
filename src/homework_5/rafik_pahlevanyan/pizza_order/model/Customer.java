package homework_5.rafik_pahlevanyan.pizza_order.model;

public class Customer {
    private final String name;
    private final int number;


    public Customer(String name) {
        this.name = name;
        this.number = addCustomerNumber();
    }

    private int addCustomerNumber() {
        double v = Math.random() * 10000;
        return (int) v;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (getNumber() != customer.getNumber()) return false;
        return getName() != null ? getName().equals(customer.getName()) : customer.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getNumber();
        return result;
    }
}