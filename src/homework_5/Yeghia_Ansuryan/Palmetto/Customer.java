package homework_5.Yeghia_Ansuryan.Palmetto;

public class Customer {

    private String name;
    private int customerNumber = 1000;

    public int getCustomerNumber() {
        return customerNumber++;
    }

    public String getName() {
        return name;
    }

    public Customer() {

        this.name = name;
    }
}
