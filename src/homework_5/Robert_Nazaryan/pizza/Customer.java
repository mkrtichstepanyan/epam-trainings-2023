package homework_5.Robert_Nazaryan.pizza;

import java.util.Random;

public class Customer {
    private int number;
    private String name;

    public Customer(String name) {
        this.number = new Random().nextInt(9999 - 1000) + 1000;
        if (name.length() >= 4 && name.length() <= 20) {
            setName(name);
        } else {
            setName("customer_name_" + getNumber());
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
