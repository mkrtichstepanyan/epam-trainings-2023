package homework_5.Anna_Manukyan.Pizzeria;

import java.util.Random;

public class Customer {
    private String name;
    private int number;

    public Customer(String name) {
        this.name = name;
        this.number = new Random().nextInt(10000);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

}
